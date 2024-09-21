const ordenate =(nameString: string) => {
  let nameOrdened = nameString.split('').sort().join('');
  console.log(nameOrdened);
  let nameArray = nameOrdened.split(''); 
  console.log(nameArray.length)
  for(var i=0; i < (nameArray.length-1)/2; i++){
    console.log(i)
    var letterInitial = nameArray[i]; 
    var actualLetter;
    var finalLetter = nameArray[nameArray.length-i-1];
    nameArray[nameArray.length - i-1] = letterInitial;
      
    for(let j = i; j<nameArray.length -1 - i;j++){
      actualLetter = nameArray[j +1];
      nameArray[j] = actualLetter;
    }
    nameArray[nameArray.length  -i -2]= finalLetter;
  }
  return nameArray;
}

console.log(ordenate("abbabbcddce"));