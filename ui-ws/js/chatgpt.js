const idInput= document.getElementById('idInput');
const idResult = document.getElementById('idResult');
idInput.addEventListener('keyup', function(e){
        if(e.keyCode === 13){
            let input = idInput.value;
            var myHeaders = new Headers();
            myHeaders.append("Content-Type", "application/json");
            myHeaders.append("Authorization", "Bearer ${apiKeys}");

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

