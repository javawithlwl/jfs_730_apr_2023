function showTeamNames() {
    const idShowTeamNames = document.getElementById("idShowTeamNames");
    getTeamNames().then(data => {
        console.log(data);
        idShowTeamNames.innerHTML = data;
    });
}

async function getTeamNames() {
    let res = await fetch("http://localhost:8088/iplstats/api/v1/team/names").then(res => res.json()).then(data => {
        let str = "<select id='idTeamName' class='form-control'>";
        data.forEach(team => {
            str += "<option value='" + team + "'>" + team + "</option>";
        });
        return str;
    });
    return res;
}
showTeamNames();