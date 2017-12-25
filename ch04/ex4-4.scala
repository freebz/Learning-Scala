// 표현식 블록을 이용한 함수 호출

def formatEuro(amt: Double) = f"€$amt%.2f"

formatEuro(3.4645)

formatEuro { val rate = 1.32; 0.235 + 0.7123 + rate * 5.32 }
