

function onSub(){
    var sentense = document.getElementById("Sentense").value;
    var word = document.getElementById("chkValue").value;
    let indexV = sentense.indexOf(word);
    if(indexV>0){
    
      var length = sentense.length;
    
    let result = sentense.substring(indexV+1, length);
    
    document.getElementById("result").innerHTML = result;  

    }
    else{
      document.getElementById("result").innerHTML = "The letter does not exist in the sentence";  

    }
  




}