# ems-mock

ems-mock 是一个 EMS 项目中的一个小工具，用于定时每分钟生成电水气表的数据

程序运行逻辑：
1. 从 biz_electric_meter、biz_water_meter、biz_gas_meter 等表读取出计量表信息
2. 根据当前时间戳生成模拟数据
3. 写入数据到 jetlinks 数据库的 properties_e_modbus、properties_w_modbus、properties_g_modbus 等表
