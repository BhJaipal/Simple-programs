class Stack<stackElemType>{
  private members: stackElemType[];
  constructor(...members: stackElemType[]) {
    this.members= members || [];
  }
  public print() {
    return this.members;
  }
  private overflow() {
    if (this.members.length ==0) {
      return true
    } else {return false;}
  }
  public pushOne(elem: stackElemType): void{
    this.members.push(elem);
  }
  public pushMany(...elems: stackElemType[]): void{
    this.members.concat(elems);
  }
  public pop(): stackElemType | string{
    if (!(this.overflow())) {
      return this.members.pop();
    }
    else {
      return "This stack is empty";
    }
  }
  public popMany(n: number) {
    if (!(this.overflow()) && n < this.members.length || n == this.members.length) {
      let popedElems: stackElemType[]= [];
      for (let i=0; i< n; i++) {
        popedElems.push(this.members.pop());
      }
      return popedElems;
    } else {
      return "OverflowError: Stack is either empty or less then no of elements to be poped";
    }
  }
}

export { Stack}