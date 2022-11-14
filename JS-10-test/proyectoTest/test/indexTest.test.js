
//const calculadora = require("../calculadora");
/* import { test } from "picomatch"; *//* import {indexTest} from "../calculadora"; */
import {suma} from "../calculadora";

 test ("test suma", () => {
    const r= suma.suma(1,5)
    expect (r).toBe(12);
});
test.todo('test de resta');
test.todo('test de multy');
test.todo('test de divide'); 