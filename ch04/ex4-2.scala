// 프로시저

def log(d: Double) = println(f"Got value $d%.2f")

def log(d: Double): Unit = println(f"Got value $d%.2f")

log(2.23535)


def log(d: Double) { println(f"Got value $d%.2f") }
