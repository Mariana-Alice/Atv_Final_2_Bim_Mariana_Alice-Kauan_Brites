function calcular(){
  let num1   = parseInt(document.getElementById("num1").value);
  let num2   = parseInt(document.getElementById("num2").value);
  let sinal  = document.getElementById("sinal").value;
  let result = document.getElementById("result");

  if(sinal == "+") result.value = num1 + num2;
  if(sinal == "-") result.value = num1 - num2;
  if(sinal == "*") result.value = num1 * num2;
  if(sinal == "/") result.value = num1 / num2;
}
