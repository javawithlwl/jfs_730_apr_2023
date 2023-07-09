const baseUrl = "https://ipl-jun-stats.onrender.com/iplstats/api/v1";
google.charts.load('current', { 'packages': ['corechart'] });
function showTeamNames() {
    const idShowTeamNames = document.getElementById("idShowTeamNames");
    getData(`${baseUrl}/team/names`).then(data => {
        data = getTeamNames(data);
        idShowTeamNames.innerHTML = data;
    });
}

function getTeamNames(teamNames) {
    let str = "<select id='idTeamName' class='form-control' onchange='showPlayers()'>";
    teamNames.forEach(team => {
        str += "<option value='" + team + "'>" + team + "</option>";
    });
    return str;
}

function showPlayers() {
    let teamName = document.getElementById("idTeamName").value;
    getData(`${baseUrl}/players/${teamName}`).then(data => {
        showPlayersTable(data);
    });
}

function showPlayersTable(players) {
    let str = `<table class='table table-striped'>`;
    str += `<thead class='thead-dark'>
                <tr>
                <th>Player Name</th>
                <th>Role</th>
                <th>Country</th>
                <th>Team</th>
                <th>Amount</th>
                </tr>
            </thead>`;

    str += "<tbody>";
    players.forEach(player => {
        str += `<tr>
                <td> ${player.name} </td>
                <td>${player.role}</td>
                <td>${player.country}</td>
                <td>${player.team}</td>
                <td>${player.amount}</td>
                </tr>`

    });
    str += `</tbody></table>`;
    document.getElementById("idShowPlayers").innerHTML = str;
}

function showTeamsStats() {
    google.charts.setOnLoadCallback(drawTeamStats);
    google.charts.setOnLoadCallback(drawCountryStats);
    google.charts.setOnLoadCallback(drawRoleStats);
}

function drawColumnChart(inputData, headings, title, idName) {
    var data = new google.visualization.DataTable();
    data.addColumn('string', headings[0]);
    data.addColumn('number', headings[1]);
    data.addRows(inputData);
    var options = {
        'title': `${title}`,
        'width': 500,
        'height': 300
    };
    console.log(data);
    var chart = new google.visualization.ColumnChart(document.getElementById(idName));
    chart.draw(data, options);
}
function drawPieChart(inputData, headings, title, idName) {
    var data = new google.visualization.DataTable();
    data.addColumn('string', headings[0]);
    data.addColumn('number', headings[1]);
    data.addRows(inputData);
    var options = {
        'title': `${title}`,
        'width': 500,
        'height': 300
    };
    console.log(data);
    var chart = new google.visualization.PieChart(document.getElementById(idName));
    chart.draw(data, options);
}

function drawTeamStats() {
    let headings = ["Team", "Amount"];
    getData(`${baseUrl}/team/stats`).then(data => {
        let inputData = [];
        data.forEach(team => {
            inputData.push([team.teamName, team.totalAmount]);
        });
        let title = "Team Stats";
        let idName = "idTeamStats";
        drawColumnChart(inputData, headings, title, idName)
    });
}
function drawCountryStats() {
    let headings = ["Country", "Count"];
    getData(`${baseUrl}/country/stats`).then(data => {
        let inputData = [];
        data.forEach(ele => {
            inputData.push([ele.countryName, ele.count]);
        });
        let title = "Country Stats";
        let idName = "idCountryStats";
        drawPieChart(inputData, headings, title, idName)
    });
}
function drawRoleStats() {
    let headings = ["Role", "Amount"];
    getData(`${baseUrl}/role/stats`).then(data => {
        let inputData = [];
        data.forEach(ele => {
            inputData.push([ele.roleName, ele.totalAmount]);
        });
        let title = "Role Stats";
        let idName = "idRoleStats";
        drawColumnChart(inputData, headings, title, idName)
    });
}


async function getData(url) {
    return await fetch(url).then(res => res.json());
}
showTeamNames();
showTeamsStats();