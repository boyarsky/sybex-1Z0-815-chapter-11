module zoo.animal.care {

  exports zoo.animal.care.medical;
  //exports zoo.animal.care.medical to zoo.staff;

  requires zoo.animal.feeding;
  //requires transitive zoo.animal.feeding;
}
