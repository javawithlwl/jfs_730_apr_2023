const idInput= document.getElementById('idInput');
const idResult = document.getElementById('idResult');
idInput.addEventListener('keyup', function(e){
        if(e.keyCode === 13){
            let input = idInput.value;
            var myHeaders = new Headers();
            myHeaders.append("Content-Type", "application/json");
            myHeaders.append("Authorization", "Bearer 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");

            var raw = JSON.stringify({
            "model": "text-davinci-003",
            "prompt": input,
            "temperature": 1,
            "max_tokens": 256,
            "top_p": 1,
            "frequency_penalty": 0,
            "presence_penalty": 0
            });

            var requestOptions = {
            method: 'POST',
            headers: myHeaders,
            body: raw,
            redirect: 'follow'
            };

            fetch("https://api.openai.com/v1/completions", requestOptions)
            .then(response => response.json())
            .then(result => {
                    let choices = result.choices;
                    let str = "";
                    for(choice of choices){
                        let text = choice.text;
                        str += text+"<br>";
                    }
                    idResult.innerHTML = str;
                }
        ).catch(error => console.log('error', error));
    }
});

// generate function to check given nubmer is prime or not

function isPrime(n){
    if(n<=1){
        return false;
    }
    for(let i=2; i<n; i++){
        if(n%i === 0){
            return false;
        }
    }
    return true;
}

function gcd(a,b){
    if(b === 0){
        return a;
    }
    return gcd(b, a%b);
}
function biggestOfThreeNumbers(a,b,c){
    return a > b && a>c ? a : b>c ? b : c;
}
