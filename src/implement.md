
## 1) How and where to store data ?
- ใช้วิธี encapsulation 
- สร้างตัวแปรเป็น private
- มี methods getter และ setter เพื่อเข้าถึงและปรับเปลี่ยนข้อมูล
- เก็บข้อมูลภายในแต่ละคลาสตามที่เหมาะสม

# 2) what operations are needed ?

## Character Class Operations
### Variables
- `name`: ชื่อของตัวละคร
- `level`: ระดับของตัวละคร
- `hp`: ค่าแรงสุขของตัวละครปัจจุบัน
- `maxHp`: ค่าแรงสุขสูงสุดของตัวละคร
- `mana`: จำนวนแมน่าปัจจุบันของตัวละคร
- `maxMana`: จำนวนแมน่าสูงสุดของตัวละคร
- `baseSpeed`: ค่าความเร็วพื้นฐาน
- `speed`: ความเร็วปัจจุบันของตัวละคร
- `maxSpeed`: ความเร็วสูงสุดของตัวละคร
- `sword`: ดาบที่ตัวละครกำลังใช้
- `shield`: โล่ที่ตัวละครถือ

### Methods
- `UpdateStats()`: คำนวณค่าแรงสุขสูงสุด, จำนวนแมน่าสูงสุด และความเร็วสูงสุดโดยขึ้นอยู่กับระดับ
- `UpdateSpeed()`: คำนวณความเร็วของตัวละครโดยขึ้นอยู่กับไอเท็มที่ใส่
- `LevelUp()`: เพิ่มระดับของตัวละครขึ้นอยู่กับหนึ่ง
- `EquipSword()`: ใส่ดาบให้ตัวละคร
- `EquipShield()`: ใส่โล่ให้ตัวละคร
- `UnequipSword()`: ถอดดาบที่ใส่
- `UnequipShield()`: ถอดโล่ที่ถือ
- `Attack(Character)`: ทำการโจมตีพร้อมกับผลลัพธ์ที่ขึ้นอยู่กับไอเท็มที่ใส่
- `TakeDamage(double)`: ลด HP โดยขึ้นอยู่กับความเสียหายที่ได้รับ
- `Fight(Character, Character)`: ทำการต่อสู้ระหว่างตัวละครสองตัว
- `ShowStats()`: พิมพ์สถิติปัจจุบัน

## Sword class Operations
### Variables

- `name`: ชื่อของดาบ
- `swordLevel`: ระดับของดาบ
- `baseDamage`: ค่าความเสียหายการโจมตีพื้นฐาน
- `damage`: ความเสียหายการโจมตี
- `speedDecreaseRate`: อัตราการลดความเร็วขึ้นอยู่กับระดับของดาบ

### Methods

- `UpdateSwordStats()`: คำนวณสถิติของดาบเมื่อเพิ่มระดับ
- `Upgrade()`: เพิ่มระดับของดาบ
- `Sword()`: เมทอดกำหนดค่าเริ่มต้น
- `GetSpeedDecreaseRate()`: ดึงข้อมูลอัตราการลดความเร็ว
- `GetName()`: ดึงชื่อของดาบ
- `GetLevel()`: ดึงระดับของดาบ
- `GetDamage()`: ดึงค่าความเสียหายการโจมตี
- `ShowStats()`: พิมพ์สถิติปัจจุบันของดาบ

## Shield class Operations
### Variables
- `name`: ชื่อของโล่
- `shieldLevel`: ระดับของโล่
- `baseDefense`: ค่าป้องกันพื้นฐาน
- `defense`: ค่าป้องกัน
- `speedDecreaseRate`: อัตราการลดความเร็วขึ้นอยู่กับระดับของโล่

### Methods
- `UpdateShieldStats()`: คำนวณสถิติของโล่เมื่อเพิ่มระดับ
- `Upgrade()`: เพิ่มระดับของโล่
- `Shield()`: เมทอดกำหนดค่าเริ่มต้น
- `GetSpeedDecreaseRate()`: ดึงข้อมูลอัตราการลดความเร็ว
- `GetName()`: ดึงชื่อของโล่
- `GetLevel()`: ดึงระดับของโล่
- `GetDefense()`: ดึงค่าป้องกัน
- `ShowStats()`: พิมพ์สถิติปัจจุบันของโล่

# how and where to compute information ?
- see in question 2
