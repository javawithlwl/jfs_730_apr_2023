
// function add(num1, num2){
//     return num1 + num2;
// }

// function sub(num1, num2){
//     return num1 - num2;
// }
// function mul(num1, num2){
//     return num1 * num2;
// }
// function div(num1, num2){
//     return num1 / num2;
// }
// function big(num1, num2){
//    return num1 > num2 ? num1 : num2;
// }

add = (num1, num2) => num1 + num2;

function perform(num1, num2, callback){
    return callback(num1, num2);
}

let result = perform(10, 20, (a,b)=>a+b);
console.log(result);




function calculateEmi(){
    let p = document.querySelector("#amount").value;
    let rate   = document.querySelector("#rate").value;
    let t = document.querySelector("#months").value;
    r = rate / (12 * 100);
    let emiAmount = p * r * Math.pow(1 + r, t) / (Math.pow(1 + r, t) - 1);
    let idShowResult = document.querySelector("#showResult");
    idShowResult.innerHTML=`<strong>Amount: ${p}, Rate: ${rate}%, Months: ${t} and EMI amount is :${emiAmount}</strong>`;
}
i = 1;
function switchOn(){
    let ele = document.querySelector("#idBulb");
    if(i == 1){
        ele.src = "img/off.png";
        i=0;
    }else{
        ele.src = "img/on.png";
        i=1;
    }
}
const idFactorial = document.querySelector("#idFactorial");
const idReverse = document.querySelector("#idReverse");

idFactorial.addEventListener("click",function(){
    let num = document.querySelector("#idNumber").value;
    let fact = 1;
    for(let i=1;i<=num;i++){
        fact = fact * i;
    }
    let idResult = document.querySelector("#idResult");
    idResult.value=fact;
});

idReverse.addEventListener("click",function(){
    let num = document.querySelector("#idNumber").value;
    let rev = reverse(num);
    let idResult = document.querySelector("#idResult");
    idResult.value=rev;
});

function reverse(num){
    let rev = 0;
    while(num>0){
        let rem = num % 10;
        rev = rev * 10 + rem;
        num = parseInt(num / 10);
    }
    return rev;
}

const idSearch = document.querySelector("#idSearch");

idSearch.addEventListener("keyup",function(event){
    if(event.keyCode === 13){
        let searchStr = event.target.value;
        let searchData = filterData(searchStr);
        let htmlStr = "";
        if(searchData.length > 0){
            htmlStr = "";
            for(let i=0;i<searchData.length;i++){
                htmlStr += `<tr>
                <td>${searchData[i].id}</td>
                <td>${searchData[i].first_name}</td>
                <td>${searchData[i].last_name}</td>
                <td>${searchData[i].email}</td>
                <td>${searchData[i].gender}</td>
                <td>${searchData[i].ip_address}</td>
                </tr>`;
   
            }
        }else{
            htmlStr = `<tr>
            <td colspan="6">No Record Found</td>
            </tr>`;
        }
        let idTableBody = document.querySelector("#idTableBody");
        idTableBody.innerHTML = htmlStr;
    }
});

function filterData(searchStr){
    let filterData = users.filter(item=>{
        return item.first_name.toLowerCase().indexOf(searchStr.toLowerCase()) > -1;
    });
     return filterData;
}

let users = [{
    "id": 1,
    "first_name": "Annabella",
    "last_name": "Ibotson",
    "email": "aibotson0@behance.net",
    "gender": "Female",
    "ip_address": "167.48.233.250"
  }, {
    "id": 2,
    "first_name": "Ruthi",
    "last_name": "Coogan",
    "email": "rcoogan1@seattletimes.com",
    "gender": "Female",
    "ip_address": "172.55.227.255"
  }, {
    "id": 3,
    "first_name": "Tibold",
    "last_name": "Watkiss",
    "email": "twatkiss2@163.com",
    "gender": "Male",
    "ip_address": "108.77.66.17"
  }, {
    "id": 4,
    "first_name": "Laurianne",
    "last_name": "Petracci",
    "email": "lpetracci3@canalblog.com",
    "gender": "Female",
    "ip_address": "20.215.230.16"
  }, {
    "id": 5,
    "first_name": "Carly",
    "last_name": "Hinckesman",
    "email": "chinckesman4@ftc.gov",
    "gender": "Female",
    "ip_address": "113.182.15.142"
  }, {
    "id": 6,
    "first_name": "Burke",
    "last_name": "Naptine",
    "email": "bnaptine5@npr.org",
    "gender": "Male",
    "ip_address": "56.92.21.68"
  }, {
    "id": 7,
    "first_name": "Aidan",
    "last_name": "Josselsohn",
    "email": "ajosselsohn6@jimdo.com",
    "gender": "Female",
    "ip_address": "176.143.71.186"
  }, {
    "id": 8,
    "first_name": "Raymund",
    "last_name": "Guslon",
    "email": "rguslon7@yale.edu",
    "gender": "Male",
    "ip_address": "196.131.4.137"
  }, {
    "id": 9,
    "first_name": "Gwyn",
    "last_name": "Bane",
    "email": "gbane8@ftc.gov",
    "gender": "Female",
    "ip_address": "238.94.225.94"
  }, {
    "id": 10,
    "first_name": "Lisa",
    "last_name": "Pues",
    "email": "lpues9@bing.com",
    "gender": "Non-binary",
    "ip_address": "175.142.135.179"
  }, {
    "id": 11,
    "first_name": "Dew",
    "last_name": "Iverson",
    "email": "diversona@instagram.com",
    "gender": "Male",
    "ip_address": "58.65.140.217"
  }, {
    "id": 12,
    "first_name": "Luci",
    "last_name": "Georgiades",
    "email": "lgeorgiadesb@cisco.com",
    "gender": "Female",
    "ip_address": "217.160.2.213"
  }, {
    "id": 13,
    "first_name": "Raynard",
    "last_name": "Soar",
    "email": "rsoarc@businessweek.com",
    "gender": "Male",
    "ip_address": "198.79.70.140"
  }, {
    "id": 14,
    "first_name": "David",
    "last_name": "Bachshell",
    "email": "dbachshelld@miibeian.gov.cn",
    "gender": "Male",
    "ip_address": "133.241.84.2"
  }, {
    "id": 15,
    "first_name": "Rowe",
    "last_name": "Turone",
    "email": "rturonee@themeforest.net",
    "gender": "Female",
    "ip_address": "39.1.83.191"
  }, {
    "id": 16,
    "first_name": "Elianore",
    "last_name": "Roseveare",
    "email": "erosevearef@smh.com.au",
    "gender": "Female",
    "ip_address": "2.145.240.20"
  }, {
    "id": 17,
    "first_name": "Davie",
    "last_name": "Roach",
    "email": "droachg@prnewswire.com",
    "gender": "Male",
    "ip_address": "52.92.198.93"
  }, {
    "id": 18,
    "first_name": "Lilli",
    "last_name": "Huddle",
    "email": "lhuddleh@chronoengine.com",
    "gender": "Female",
    "ip_address": "230.255.9.249"
  }, {
    "id": 19,
    "first_name": "Jolie",
    "last_name": "Raymen",
    "email": "jraymeni@eepurl.com",
    "gender": "Female",
    "ip_address": "91.37.168.86"
  }, {
    "id": 20,
    "first_name": "Zelma",
    "last_name": "Grove",
    "email": "zgrovej@netlog.com",
    "gender": "Female",
    "ip_address": "187.119.144.17"
  }, {
    "id": 21,
    "first_name": "Kevan",
    "last_name": "Mosey",
    "email": "kmoseyk@statcounter.com",
    "gender": "Male",
    "ip_address": "163.18.159.106"
  }, {
    "id": 22,
    "first_name": "Dane",
    "last_name": "Garritley",
    "email": "dgarritleyl@indiegogo.com",
    "gender": "Male",
    "ip_address": "6.57.170.209"
  }, {
    "id": 23,
    "first_name": "Lilyan",
    "last_name": "Postlethwaite",
    "email": "lpostlethwaitem@prlog.org",
    "gender": "Bigender",
    "ip_address": "176.225.145.102"
  }, {
    "id": 24,
    "first_name": "Torin",
    "last_name": "Formby",
    "email": "tformbyn@usda.gov",
    "gender": "Male",
    "ip_address": "26.253.128.115"
  }, {
    "id": 25,
    "first_name": "Keary",
    "last_name": "Scammonden",
    "email": "kscammondeno@dmoz.org",
    "gender": "Male",
    "ip_address": "218.148.9.33"
  }, {
    "id": 26,
    "first_name": "Armando",
    "last_name": "Gamblin",
    "email": "agamblinp@jugem.jp",
    "gender": "Male",
    "ip_address": "101.56.166.107"
  }, {
    "id": 27,
    "first_name": "Christel",
    "last_name": "Joplin",
    "email": "cjoplinq@tripod.com",
    "gender": "Female",
    "ip_address": "65.125.122.232"
  }, {
    "id": 28,
    "first_name": "Johnathon",
    "last_name": "McClarence",
    "email": "jmcclarencer@tmall.com",
    "gender": "Male",
    "ip_address": "114.211.222.149"
  }, {
    "id": 29,
    "first_name": "Prissie",
    "last_name": "Cornely",
    "email": "pcornelys@cpanel.net",
    "gender": "Female",
    "ip_address": "179.108.177.75"
  }, {
    "id": 30,
    "first_name": "Lancelot",
    "last_name": "Eckford",
    "email": "leckfordt@prweb.com",
    "gender": "Male",
    "ip_address": "161.153.242.21"
  }, {
    "id": 31,
    "first_name": "Shaughn",
    "last_name": "Schenfisch",
    "email": "sschenfischu@amazon.co.uk",
    "gender": "Male",
    "ip_address": "209.239.169.90"
  }, {
    "id": 32,
    "first_name": "Eustace",
    "last_name": "Lilleman",
    "email": "elillemanv@wunderground.com",
    "gender": "Male",
    "ip_address": "55.49.41.153"
  }, {
    "id": 33,
    "first_name": "Claudio",
    "last_name": "Thorneywork",
    "email": "cthorneyworkw@privacy.gov.au",
    "gender": "Male",
    "ip_address": "40.97.21.177"
  }, {
    "id": 34,
    "first_name": "Rae",
    "last_name": "Syddon",
    "email": "rsyddonx@prlog.org",
    "gender": "Non-binary",
    "ip_address": "86.156.109.219"
  }, {
    "id": 35,
    "first_name": "Fons",
    "last_name": "Romme",
    "email": "frommey@zimbio.com",
    "gender": "Male",
    "ip_address": "126.21.89.153"
  }, {
    "id": 36,
    "first_name": "Curran",
    "last_name": "Wallbridge",
    "email": "cwallbridgez@home.pl",
    "gender": "Male",
    "ip_address": "169.62.248.159"
  }, {
    "id": 37,
    "first_name": "Ernest",
    "last_name": "Fairlaw",
    "email": "efairlaw10@nifty.com",
    "gender": "Male",
    "ip_address": "36.10.188.210"
  }, {
    "id": 38,
    "first_name": "Lyndsie",
    "last_name": "Carass",
    "email": "lcarass11@edublogs.org",
    "gender": "Female",
    "ip_address": "83.73.28.133"
  }, {
    "id": 39,
    "first_name": "Davine",
    "last_name": "Storms",
    "email": "dstorms12@dell.com",
    "gender": "Female",
    "ip_address": "55.203.177.75"
  }, {
    "id": 40,
    "first_name": "Amerigo",
    "last_name": "Beames",
    "email": "abeames13@rakuten.co.jp",
    "gender": "Male",
    "ip_address": "80.150.56.233"
  }, {
    "id": 41,
    "first_name": "Gretna",
    "last_name": "Brandi",
    "email": "gbrandi14@aol.com",
    "gender": "Female",
    "ip_address": "201.224.240.68"
  }, {
    "id": 42,
    "first_name": "Thane",
    "last_name": "Maffulli",
    "email": "tmaffulli15@hibu.com",
    "gender": "Male",
    "ip_address": "209.115.187.207"
  }, {
    "id": 43,
    "first_name": "Filia",
    "last_name": "Davenhill",
    "email": "fdavenhill16@soup.io",
    "gender": "Female",
    "ip_address": "163.84.143.83"
  }, {
    "id": 44,
    "first_name": "Ericka",
    "last_name": "McManamen",
    "email": "emcmanamen17@hubpages.com",
    "gender": "Female",
    "ip_address": "196.221.86.220"
  }, {
    "id": 45,
    "first_name": "Lowe",
    "last_name": "Gianiello",
    "email": "lgianiello18@themeforest.net",
    "gender": "Male",
    "ip_address": "154.12.201.160"
  }, {
    "id": 46,
    "first_name": "Patsy",
    "last_name": "Caller",
    "email": "pcaller19@desdev.cn",
    "gender": "Female",
    "ip_address": "30.39.98.87"
  }, {
    "id": 47,
    "first_name": "Christie",
    "last_name": "Lemin",
    "email": "clemin1a@diigo.com",
    "gender": "Genderfluid",
    "ip_address": "110.70.231.171"
  }, {
    "id": 48,
    "first_name": "Tiler",
    "last_name": "Westmacott",
    "email": "twestmacott1b@xing.com",
    "gender": "Male",
    "ip_address": "214.122.51.224"
  }, {
    "id": 49,
    "first_name": "Rheba",
    "last_name": "Jacobbe",
    "email": "rjacobbe1c@naver.com",
    "gender": "Female",
    "ip_address": "203.150.64.32"
  }, {
    "id": 50,
    "first_name": "Filmer",
    "last_name": "Larroway",
    "email": "flarroway1d@4shared.com",
    "gender": "Male",
    "ip_address": "158.127.78.168"
  }, {
    "id": 51,
    "first_name": "Kimball",
    "last_name": "Gerhardt",
    "email": "kgerhardt1e@scribd.com",
    "gender": "Male",
    "ip_address": "164.243.188.182"
  }, {
    "id": 52,
    "first_name": "Thorvald",
    "last_name": "Zini",
    "email": "tzini1f@nba.com",
    "gender": "Male",
    "ip_address": "254.241.16.214"
  }, {
    "id": 53,
    "first_name": "Gretel",
    "last_name": "O'Grady",
    "email": "gogrady1g@alibaba.com",
    "gender": "Female",
    "ip_address": "107.101.188.118"
  }, {
    "id": 54,
    "first_name": "Stearne",
    "last_name": "Sivior",
    "email": "ssivior1h@abc.net.au",
    "gender": "Male",
    "ip_address": "173.170.89.2"
  }, {
    "id": 55,
    "first_name": "Stephenie",
    "last_name": "Durnill",
    "email": "sdurnill1i@comcast.net",
    "gender": "Female",
    "ip_address": "52.94.74.164"
  }, {
    "id": 56,
    "first_name": "Jedd",
    "last_name": "Robe",
    "email": "jrobe1j@merriam-webster.com",
    "gender": "Male",
    "ip_address": "100.101.69.109"
  }, {
    "id": 57,
    "first_name": "Davide",
    "last_name": "Silvermann",
    "email": "dsilvermann1k@tuttocitta.it",
    "gender": "Male",
    "ip_address": "117.147.246.21"
  }, {
    "id": 58,
    "first_name": "Van",
    "last_name": "Bickardike",
    "email": "vbickardike1l@jugem.jp",
    "gender": "Male",
    "ip_address": "172.227.71.189"
  }, {
    "id": 59,
    "first_name": "Deb",
    "last_name": "Gebbie",
    "email": "dgebbie1m@narod.ru",
    "gender": "Female",
    "ip_address": "66.132.17.157"
  }, {
    "id": 60,
    "first_name": "Joachim",
    "last_name": "Romanet",
    "email": "jromanet1n@de.vu",
    "gender": "Male",
    "ip_address": "78.134.214.199"
  }, {
    "id": 61,
    "first_name": "Griz",
    "last_name": "Henrichs",
    "email": "ghenrichs1o@irs.gov",
    "gender": "Male",
    "ip_address": "96.22.161.219"
  }, {
    "id": 62,
    "first_name": "Arte",
    "last_name": "Tuerena",
    "email": "atuerena1p@edublogs.org",
    "gender": "Male",
    "ip_address": "125.92.145.189"
  }, {
    "id": 63,
    "first_name": "Constantia",
    "last_name": "Snoxall",
    "email": "csnoxall1q@github.io",
    "gender": "Female",
    "ip_address": "21.7.227.53"
  }, {
    "id": 64,
    "first_name": "Kathye",
    "last_name": "Garrod",
    "email": "kgarrod1r@jalbum.net",
    "gender": "Female",
    "ip_address": "51.238.105.197"
  }, {
    "id": 65,
    "first_name": "Jannel",
    "last_name": "Woodlands",
    "email": "jwoodlands1s@wp.com",
    "gender": "Female",
    "ip_address": "113.52.125.49"
  }, {
    "id": 66,
    "first_name": "Francyne",
    "last_name": "Maddrah",
    "email": "fmaddrah1t@irs.gov",
    "gender": "Genderfluid",
    "ip_address": "4.197.66.127"
  }, {
    "id": 67,
    "first_name": "Bettye",
    "last_name": "Tredger",
    "email": "btredger1u@amazon.com",
    "gender": "Female",
    "ip_address": "214.211.137.167"
  }, {
    "id": 68,
    "first_name": "Land",
    "last_name": "Chellenham",
    "email": "lchellenham1v@earthlink.net",
    "gender": "Male",
    "ip_address": "241.195.228.65"
  }, {
    "id": 69,
    "first_name": "Lise",
    "last_name": "Leaman",
    "email": "lleaman1w@amazon.de",
    "gender": "Female",
    "ip_address": "221.48.189.11"
  }, {
    "id": 70,
    "first_name": "Dusty",
    "last_name": "Orrock",
    "email": "dorrock1x@virginia.edu",
    "gender": "Female",
    "ip_address": "94.15.246.118"
  }, {
    "id": 71,
    "first_name": "Emmet",
    "last_name": "Beatty",
    "email": "ebeatty1y@wordpress.org",
    "gender": "Male",
    "ip_address": "2.73.44.74"
  }, {
    "id": 72,
    "first_name": "Zackariah",
    "last_name": "Casperri",
    "email": "zcasperri1z@exblog.jp",
    "gender": "Male",
    "ip_address": "18.254.169.15"
  }, {
    "id": 73,
    "first_name": "Bronny",
    "last_name": "Maps",
    "email": "bmaps20@merriam-webster.com",
    "gender": "Male",
    "ip_address": "238.137.8.157"
  }, {
    "id": 74,
    "first_name": "Evelyn",
    "last_name": "Avrahm",
    "email": "eavrahm21@amazon.de",
    "gender": "Male",
    "ip_address": "242.234.208.198"
  }, {
    "id": 75,
    "first_name": "Nikolaus",
    "last_name": "Healeas",
    "email": "nhealeas22@jugem.jp",
    "gender": "Male",
    "ip_address": "132.240.14.6"
  }, {
    "id": 76,
    "first_name": "Bjorn",
    "last_name": "Whitloe",
    "email": "bwhitloe23@people.com.cn",
    "gender": "Male",
    "ip_address": "33.46.196.54"
  }, {
    "id": 77,
    "first_name": "Benjie",
    "last_name": "Rodder",
    "email": "brodder24@ucoz.ru",
    "gender": "Male",
    "ip_address": "172.210.237.75"
  }, {
    "id": 78,
    "first_name": "Ginger",
    "last_name": "Hoffner",
    "email": "ghoffner25@yahoo.co.jp",
    "gender": "Female",
    "ip_address": "233.23.133.115"
  }, {
    "id": 79,
    "first_name": "Hayley",
    "last_name": "Smart",
    "email": "hsmart26@rakuten.co.jp",
    "gender": "Female",
    "ip_address": "95.207.172.62"
  }, {
    "id": 80,
    "first_name": "Tarrance",
    "last_name": "Bottoner",
    "email": "tbottoner27@joomla.org",
    "gender": "Male",
    "ip_address": "41.64.142.226"
  }, {
    "id": 81,
    "first_name": "Chilton",
    "last_name": "Brightling",
    "email": "cbrightling28@ocn.ne.jp",
    "gender": "Male",
    "ip_address": "126.203.96.92"
  }, {
    "id": 82,
    "first_name": "Sutherland",
    "last_name": "Corneljes",
    "email": "scorneljes29@ucla.edu",
    "gender": "Male",
    "ip_address": "166.116.82.38"
  }, {
    "id": 83,
    "first_name": "Sybille",
    "last_name": "Paule",
    "email": "spaule2a@bloomberg.com",
    "gender": "Female",
    "ip_address": "141.178.146.194"
  }, {
    "id": 84,
    "first_name": "Nata",
    "last_name": "Sive",
    "email": "nsive2b@thetimes.co.uk",
    "gender": "Female",
    "ip_address": "250.49.47.12"
  }, {
    "id": 85,
    "first_name": "Kimbell",
    "last_name": "Gilding",
    "email": "kgilding2c@army.mil",
    "gender": "Male",
    "ip_address": "25.148.196.241"
  }, {
    "id": 86,
    "first_name": "Gusta",
    "last_name": "Chasle",
    "email": "gchasle2d@engadget.com",
    "gender": "Female",
    "ip_address": "83.59.159.58"
  }, {
    "id": 87,
    "first_name": "Merrilee",
    "last_name": "Vardy",
    "email": "mvardy2e@live.com",
    "gender": "Female",
    "ip_address": "34.176.32.3"
  }, {
    "id": 88,
    "first_name": "Gerta",
    "last_name": "Sandry",
    "email": "gsandry2f@dailymail.co.uk",
    "gender": "Agender",
    "ip_address": "24.6.54.129"
  }, {
    "id": 89,
    "first_name": "Alidia",
    "last_name": "Huller",
    "email": "ahuller2g@soundcloud.com",
    "gender": "Female",
    "ip_address": "154.174.72.161"
  }, {
    "id": 90,
    "first_name": "Emera",
    "last_name": "McCafferky",
    "email": "emccafferky2h@wunderground.com",
    "gender": "Female",
    "ip_address": "255.69.4.197"
  }, {
    "id": 91,
    "first_name": "Ignazio",
    "last_name": "Dybbe",
    "email": "idybbe2i@alexa.com",
    "gender": "Male",
    "ip_address": "154.135.120.103"
  }, {
    "id": 92,
    "first_name": "Bonni",
    "last_name": "Garrie",
    "email": "bgarrie2j@oracle.com",
    "gender": "Female",
    "ip_address": "12.106.9.161"
  }, {
    "id": 93,
    "first_name": "Gar",
    "last_name": "Housen",
    "email": "ghousen2k@reverbnation.com",
    "gender": "Bigender",
    "ip_address": "158.20.194.70"
  }, {
    "id": 94,
    "first_name": "Claus",
    "last_name": "Carmen",
    "email": "ccarmen2l@hatena.ne.jp",
    "gender": "Male",
    "ip_address": "100.182.167.247"
  }, {
    "id": 95,
    "first_name": "Cyndi",
    "last_name": "Lanktree",
    "email": "clanktree2m@prweb.com",
    "gender": "Female",
    "ip_address": "88.249.161.215"
  }, {
    "id": 96,
    "first_name": "Turner",
    "last_name": "Penna",
    "email": "tpenna2n@who.int",
    "gender": "Male",
    "ip_address": "114.62.214.80"
  }, {
    "id": 97,
    "first_name": "John",
    "last_name": "Collier",
    "email": "jcollier2o@icio.us",
    "gender": "Male",
    "ip_address": "187.7.213.63"
  }, {
    "id": 98,
    "first_name": "Roxy",
    "last_name": "Odo",
    "email": "rodo2p@webeden.co.uk",
    "gender": "Female",
    "ip_address": "70.171.79.164"
  }, {
    "id": 99,
    "first_name": "Quintana",
    "last_name": "O'Lunny",
    "email": "qolunny2q@ftc.gov",
    "gender": "Female",
    "ip_address": "173.254.9.15"
  }, {
    "id": 100,
    "first_name": "Carmina",
    "last_name": "Goadsby",
    "email": "cgoadsby2r@nytimes.com",
    "gender": "Female",
    "ip_address": "13.102.18.243"
  }]
  