//ok
// class A extends B { }

//not ok
// class A extends B, C { }
// class A extends D { }
// class A extends D, E { }

// not ok
// class A implements B { }
// class A implements B, C { }

//ok
// class A implements D { }
// class A implements D, E { }


class B { }

class C { }

interface D { }

interface E { }

interface F { }