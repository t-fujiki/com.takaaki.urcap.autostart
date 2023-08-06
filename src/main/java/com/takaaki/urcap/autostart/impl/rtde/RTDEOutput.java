package com.takaaki.urcap.autostart.impl.rtde;

public enum RTDEOutput {

    timestamp("timestamp"), /**/
    target_q("target_q"), /**/
    target_qd("target_qd"), /**/
    target_qdd("target_qdd"), /**/
    target_current("target_current"), /**/
    target_moment("target_moment"), /**/
    actual_q("actual_q"), /**/
    actual_qd("actual_qd"), /**/
    actual_current("actual_current"), /**/
    joint_control_output("joint_control_output"), /**/
    actual_TCP_pose("actual_TCP_pose"), /**/
    actual_TCP_speed("actual_TCP_speed"), /**/
    actual_TCP_force("actual_TCP_force"), /**/
    target_TCP_pose("target_TCP_pose"), /**/
    target_TCP_speed("target_TCP_speed"), /**/
    actual_digital_input_bits("actual_digital_input_bits"), /**/
    joint_temperatures("joint_temperatures"), /**/
    actual_execution_time("actual_execution_time"), /**/
    robot_mode("robot_mode"), /**/
    joint_mode("joint_mode"), /**/
    safety_mode("safety_mode"), /**/
    safety_status("safety_status"), /**/
    actual_tool_accelerometer("actual_tool_accelerometer"), /**/
    speed_scaling("speed_scaling"), /**/
    target_speed_fraction("target_speed_fraction"), /**/
    actual_momentum("actual_momentum"), /**/
    actual_main_voltage("actual_main_voltage"), /**/
    actual_robot_voltage("actual_robot_voltage"), /**/
    actual_robot_current("actual_robot_current"), /**/
    actual_joint_voltage("actual_joint_voltage"), /**/
    actual_digital_output_bits("actual_digital_output_bits"), /**/
    runtime_state("runtime_state"), /**/
    elbow_position("elbow_position"), /**/
    elbow_velocity("elbow_velocity"), /**/
    robot_status_bits("robot_status_bits"), /**/
    safety_status_bits("safety_status_bits"), /**/
    analog_io_types("analog_io_types"), /**/
    standard_analog_input0("standard_analog_input0"), /**/
    standard_analog_input1("standard_analog_input1"), /**/
    standard_analog_output0("standard_analog_output0"), /**/
    standard_analog_output1("standard_analog_output1"), /**/
    io_current("io_current"), /**/
    euromap67_input_bits("euromap67_input_bits"), /**/
    euromap67_output_bits("euromap67_output_bits"), /**/
    euromap67_24V_voltage("euromap67_24V_voltage"), /**/
    euromap67_24V_current("euromap67_24V_current"), /**/
    tool_mode("tool_mode"), /**/
    tool_analog_input_types("tool_analog_input_types"), /**/
    tool_analog_input0("tool_analog_input0"), /**/
    tool_analog_input1("tool_analog_input1"), /**/
    tool_output_voltage("tool_output_voltage"), /**/
    tool_output_current("tool_output_current"), /**/
    tool_temperature("tool_temperature"), /**/
    tcp_force_scalar("tcp_force_scalar"), /**/
    output_bit_registers0_to_31("output_bit_registers0_to_31"), /**/
    output_bit_registers32_to_63("output_bit_registers32_to_63"), /**/
    output_bit_register_64("output_bit_register_64"), /**/
    output_bit_register_65("output_bit_register_65"), /**/
    output_bit_register_66("output_bit_register_66"), /**/
    output_bit_register_67("output_bit_register_67"), /**/
    output_bit_register_68("output_bit_register_68"), /**/
    output_bit_register_69("output_bit_register_69"), /**/
    output_bit_register_70("output_bit_register_70"), /**/
    output_bit_register_71("output_bit_register_71"), /**/
    output_bit_register_72("output_bit_register_72"), /**/
    output_bit_register_73("output_bit_register_73"), /**/
    output_bit_register_74("output_bit_register_74"), /**/
    output_bit_register_75("output_bit_register_75"), /**/
    output_bit_register_76("output_bit_register_76"), /**/
    output_bit_register_77("output_bit_register_77"), /**/
    output_bit_register_78("output_bit_register_78"), /**/
    output_bit_register_79("output_bit_register_79"), /**/
    output_bit_register_80("output_bit_register_80"), /**/
    output_bit_register_81("output_bit_register_81"), /**/
    output_bit_register_82("output_bit_register_82"), /**/
    output_bit_register_83("output_bit_register_83"), /**/
    output_bit_register_84("output_bit_register_84"), /**/
    output_bit_register_85("output_bit_register_85"), /**/
    output_bit_register_86("output_bit_register_86"), /**/
    output_bit_register_87("output_bit_register_87"), /**/
    output_bit_register_88("output_bit_register_88"), /**/
    output_bit_register_89("output_bit_register_89"), /**/
    output_bit_register_90("output_bit_register_90"), /**/
    output_bit_register_91("output_bit_register_91"), /**/
    output_bit_register_92("output_bit_register_92"), /**/
    output_bit_register_93("output_bit_register_93"), /**/
    output_bit_register_94("output_bit_register_94"), /**/
    output_bit_register_95("output_bit_register_95"), /**/
    output_bit_register_96("output_bit_register_96"), /**/
    output_bit_register_97("output_bit_register_97"), /**/
    output_bit_register_98("output_bit_register_98"), /**/
    output_bit_register_99("output_bit_register_99"), /**/
    output_bit_register_100("output_bit_register_100"), /**/
    output_bit_register_101("output_bit_register_101"), /**/
    output_bit_register_102("output_bit_register_102"), /**/
    output_bit_register_103("output_bit_register_103"), /**/
    output_bit_register_104("output_bit_register_104"), /**/
    output_bit_register_105("output_bit_register_105"), /**/
    output_bit_register_106("output_bit_register_106"), /**/
    output_bit_register_107("output_bit_register_107"), /**/
    output_bit_register_108("output_bit_register_108"), /**/
    output_bit_register_109("output_bit_register_109"), /**/
    output_bit_register_110("output_bit_register_110"), /**/
    output_bit_register_111("output_bit_register_111"), /**/
    output_bit_register_112("output_bit_register_112"), /**/
    output_bit_register_113("output_bit_register_113"), /**/
    output_bit_register_114("output_bit_register_114"), /**/
    output_bit_register_115("output_bit_register_115"), /**/
    output_bit_register_116("output_bit_register_116"), /**/
    output_bit_register_117("output_bit_register_117"), /**/
    output_bit_register_118("output_bit_register_118"), /**/
    output_bit_register_119("output_bit_register_119"), /**/
    output_bit_register_120("output_bit_register_120"), /**/
    output_bit_register_121("output_bit_register_121"), /**/
    output_bit_register_122("output_bit_register_122"), /**/
    output_bit_register_123("output_bit_register_123"), /**/
    output_bit_register_124("output_bit_register_124"), /**/
    output_bit_register_125("output_bit_register_125"), /**/
    output_bit_register_126("output_bit_register_126"), /**/
    output_bit_register_127("output_bit_register_127"), /**/
    output_int_register_0("output_int_register_0"), /**/
    output_int_register_1("output_int_register_1"), /**/
    output_int_register_2("output_int_register_2"), /**/
    output_int_register_3("output_int_register_3"), /**/
    output_int_register_4("output_int_register_4"), /**/
    output_int_register_5("output_int_register_5"), /**/
    output_int_register_6("output_int_register_6"), /**/
    output_int_register_7("output_int_register_7"), /**/
    output_int_register_8("output_int_register_8"), /**/
    output_int_register_9("output_int_register_9"), /**/
    output_int_register_10("output_int_register_10"), /**/
    output_int_register_11("output_int_register_11"), /**/
    output_int_register_12("output_int_register_12"), /**/
    output_int_register_13("output_int_register_13"), /**/
    output_int_register_14("output_int_register_14"), /**/
    output_int_register_15("output_int_register_15"), /**/
    output_int_register_16("output_int_register_16"), /**/
    output_int_register_17("output_int_register_17"), /**/
    output_int_register_18("output_int_register_18"), /**/
    output_int_register_19("output_int_register_19"), /**/
    output_int_register_20("output_int_register_20"), /**/
    output_int_register_21("output_int_register_21"), /**/
    output_int_register_22("output_int_register_22"), /**/
    output_int_register_23("output_int_register_23"), /**/
    output_int_register_24("output_int_register_24"), /**/
    output_int_register_25("output_int_register_25"), /**/
    output_int_register_26("output_int_register_26"), /**/
    output_int_register_27("output_int_register_27"), /**/
    output_int_register_28("output_int_register_28"), /**/
    output_int_register_29("output_int_register_29"), /**/
    output_int_register_30("output_int_register_30"), /**/
    output_int_register_31("output_int_register_31"), /**/
    output_int_register_32("output_int_register_32"), /**/
    output_int_register_33("output_int_register_33"), /**/
    output_int_register_34("output_int_register_34"), /**/
    output_int_register_35("output_int_register_35"), /**/
    output_int_register_36("output_int_register_36"), /**/
    output_int_register_37("output_int_register_37"), /**/
    output_int_register_38("output_int_register_38"), /**/
    output_int_register_39("output_int_register_39"), /**/
    output_int_register_40("output_int_register_40"), /**/
    output_int_register_41("output_int_register_41"), /**/
    output_int_register_42("output_int_register_42"), /**/
    output_int_register_43("output_int_register_43"), /**/
    output_int_register_44("output_int_register_44"), /**/
    output_int_register_45("output_int_register_45"), /**/
    output_int_register_46("output_int_register_46"), /**/
    output_int_register_47("output_int_register_47"), /**/
    output_double_register_0("output_double_register_0"), /**/
    output_double_register_1("output_double_register_1"), /**/
    output_double_register_2("output_double_register_2"), /**/
    output_double_register_3("output_double_register_3"), /**/
    output_double_register_4("output_double_register_4"), /**/
    output_double_register_5("output_double_register_5"), /**/
    output_double_register_6("output_double_register_6"), /**/
    output_double_register_7("output_double_register_7"), /**/
    output_double_register_8("output_double_register_8"), /**/
    output_double_register_9("output_double_register_9"), /**/
    output_double_register_10("output_double_register_10"), /**/
    output_double_register_11("output_double_register_11"), /**/
    output_double_register_12("output_double_register_12"), /**/
    output_double_register_13("output_double_register_13"), /**/
    output_double_register_14("output_double_register_14"), /**/
    output_double_register_15("output_double_register_15"), /**/
    output_double_register_16("output_double_register_16"), /**/
    output_double_register_17("output_double_register_17"), /**/
    output_double_register_18("output_double_register_18"), /**/
    output_double_register_19("output_double_register_19"), /**/
    output_double_register_20("output_double_register_20"), /**/
    output_double_register_21("output_double_register_21"), /**/
    output_double_register_22("output_double_register_22"), /**/
    output_double_register_23("output_double_register_23"), /**/
    output_double_register_24("output_double_register_24"), /**/
    output_double_register_25("output_double_register_25"), /**/
    output_double_register_26("output_double_register_26"), /**/
    output_double_register_27("output_double_register_27"), /**/
    output_double_register_28("output_double_register_28"), /**/
    output_double_register_29("output_double_register_29"), /**/
    output_double_register_30("output_double_register_30"), /**/
    output_double_register_31("output_double_register_31"), /**/
    output_double_register_32("output_double_register_32"), /**/
    output_double_register_33("output_double_register_33"), /**/
    output_double_register_34("output_double_register_34"), /**/
    output_double_register_35("output_double_register_35"), /**/
    output_double_register_36("output_double_register_36"), /**/
    output_double_register_37("output_double_register_37"), /**/
    output_double_register_38("output_double_register_38"), /**/
    output_double_register_39("output_double_register_39"), /**/
    output_double_register_40("output_double_register_40"), /**/
    output_double_register_41("output_double_register_41"), /**/
    output_double_register_42("output_double_register_42"), /**/
    output_double_register_43("output_double_register_43"), /**/
    output_double_register_44("output_double_register_44"), /**/
    output_double_register_45("output_double_register_45"), /**/
    output_double_register_46("output_double_register_46"), /**/
    output_double_register_47("output_double_register_47"), /**/
    input_bit_registers0_to_31("input_bit_registers0_to_31"), /**/
    input_bit_registers32_to_63("input_bit_registers32_to_63"), /**/
    input_bit_register_64("input_bit_register_64"), /**/
    input_bit_register_65("input_bit_register_65"), /**/
    input_bit_register_66("input_bit_register_66"), /**/
    input_bit_register_67("input_bit_register_67"), /**/
    input_bit_register_68("input_bit_register_68"), /**/
    input_bit_register_69("input_bit_register_69"), /**/
    input_bit_register_70("input_bit_register_70"), /**/
    input_bit_register_71("input_bit_register_71"), /**/
    input_bit_register_72("input_bit_register_72"), /**/
    input_bit_register_73("input_bit_register_73"), /**/
    input_bit_register_74("input_bit_register_74"), /**/
    input_bit_register_75("input_bit_register_75"), /**/
    input_bit_register_76("input_bit_register_76"), /**/
    input_bit_register_77("input_bit_register_77"), /**/
    input_bit_register_78("input_bit_register_78"), /**/
    input_bit_register_79("input_bit_register_79"), /**/
    input_bit_register_80("input_bit_register_80"), /**/
    input_bit_register_81("input_bit_register_81"), /**/
    input_bit_register_82("input_bit_register_82"), /**/
    input_bit_register_83("input_bit_register_83"), /**/
    input_bit_register_84("input_bit_register_84"), /**/
    input_bit_register_85("input_bit_register_85"), /**/
    input_bit_register_86("input_bit_register_86"), /**/
    input_bit_register_87("input_bit_register_87"), /**/
    input_bit_register_88("input_bit_register_88"), /**/
    input_bit_register_89("input_bit_register_89"), /**/
    input_bit_register_90("input_bit_register_90"), /**/
    input_bit_register_91("input_bit_register_91"), /**/
    input_bit_register_92("input_bit_register_92"), /**/
    input_bit_register_93("input_bit_register_93"), /**/
    input_bit_register_94("input_bit_register_94"), /**/
    input_bit_register_95("input_bit_register_95"), /**/
    input_bit_register_96("input_bit_register_96"), /**/
    input_bit_register_97("input_bit_register_97"), /**/
    input_bit_register_98("input_bit_register_98"), /**/
    input_bit_register_99("input_bit_register_99"), /**/
    input_bit_register_100("input_bit_register_100"), /**/
    input_bit_register_101("input_bit_register_101"), /**/
    input_bit_register_102("input_bit_register_102"), /**/
    input_bit_register_103("input_bit_register_103"), /**/
    input_bit_register_104("input_bit_register_104"), /**/
    input_bit_register_105("input_bit_register_105"), /**/
    input_bit_register_106("input_bit_register_106"), /**/
    input_bit_register_107("input_bit_register_107"), /**/
    input_bit_register_108("input_bit_register_108"), /**/
    input_bit_register_109("input_bit_register_109"), /**/
    input_bit_register_110("input_bit_register_110"), /**/
    input_bit_register_111("input_bit_register_111"), /**/
    input_bit_register_112("input_bit_register_112"), /**/
    input_bit_register_113("input_bit_register_113"), /**/
    input_bit_register_114("input_bit_register_114"), /**/
    input_bit_register_115("input_bit_register_115"), /**/
    input_bit_register_116("input_bit_register_116"), /**/
    input_bit_register_117("input_bit_register_117"), /**/
    input_bit_register_118("input_bit_register_118"), /**/
    input_bit_register_119("input_bit_register_119"), /**/
    input_bit_register_120("input_bit_register_120"), /**/
    input_bit_register_121("input_bit_register_121"), /**/
    input_bit_register_122("input_bit_register_122"), /**/
    input_bit_register_123("input_bit_register_123"), /**/
    input_bit_register_124("input_bit_register_124"), /**/
    input_bit_register_125("input_bit_register_125"), /**/
    input_bit_register_126("input_bit_register_126"), /**/
    input_bit_register_127("input_bit_register_127"), /**/
    input_int_register_0("input_int_register_0"), /**/
    input_int_register_1("input_int_register_1"), /**/
    input_int_register_2("input_int_register_2"), /**/
    input_int_register_3("input_int_register_3"), /**/
    input_int_register_4("input_int_register_4"), /**/
    input_int_register_5("input_int_register_5"), /**/
    input_int_register_6("input_int_register_6"), /**/
    input_int_register_7("input_int_register_7"), /**/
    input_int_register_8("input_int_register_8"), /**/
    input_int_register_9("input_int_register_9"), /**/
    input_int_register_10("input_int_register_10"), /**/
    input_int_register_11("input_int_register_11"), /**/
    input_int_register_12("input_int_register_12"), /**/
    input_int_register_13("input_int_register_13"), /**/
    input_int_register_14("input_int_register_14"), /**/
    input_int_register_15("input_int_register_15"), /**/
    input_int_register_16("input_int_register_16"), /**/
    input_int_register_17("input_int_register_17"), /**/
    input_int_register_18("input_int_register_18"), /**/
    input_int_register_19("input_int_register_19"), /**/
    input_int_register_20("input_int_register_20"), /**/
    input_int_register_21("input_int_register_21"), /**/
    input_int_register_22("input_int_register_22"), /**/
    input_int_register_23("input_int_register_23"), /**/
    input_int_register_24("input_int_register_24"), /**/
    input_int_register_25("input_int_register_25"), /**/
    input_int_register_26("input_int_register_26"), /**/
    input_int_register_27("input_int_register_27"), /**/
    input_int_register_28("input_int_register_28"), /**/
    input_int_register_29("input_int_register_29"), /**/
    input_int_register_30("input_int_register_30"), /**/
    input_int_register_31("input_int_register_31"), /**/
    input_int_register_32("input_int_register_32"), /**/
    input_int_register_33("input_int_register_33"), /**/
    input_int_register_34("input_int_register_34"), /**/
    input_int_register_35("input_int_register_35"), /**/
    input_int_register_36("input_int_register_36"), /**/
    input_int_register_37("input_int_register_37"), /**/
    input_int_register_38("input_int_register_38"), /**/
    input_int_register_39("input_int_register_39"), /**/
    input_int_register_40("input_int_register_40"), /**/
    input_int_register_41("input_int_register_41"), /**/
    input_int_register_42("input_int_register_42"), /**/
    input_int_register_43("input_int_register_43"), /**/
    input_int_register_44("input_int_register_44"), /**/
    input_int_register_45("input_int_register_45"), /**/
    input_int_register_46("input_int_register_46"), /**/
    input_int_register_47("input_int_register_47"), /**/
    input_double_register_0("input_double_register_0"), /**/
    input_double_register_1("input_double_register_1"), /**/
    input_double_register_2("input_double_register_2"), /**/
    input_double_register_3("input_double_register_3"), /**/
    input_double_register_4("input_double_register_4"), /**/
    input_double_register_5("input_double_register_5"), /**/
    input_double_register_6("input_double_register_6"), /**/
    input_double_register_7("input_double_register_7"), /**/
    input_double_register_8("input_double_register_8"), /**/
    input_double_register_9("input_double_register_9"), /**/
    input_double_register_10("input_double_register_10"), /**/
    input_double_register_11("input_double_register_11"), /**/
    input_double_register_12("input_double_register_12"), /**/
    input_double_register_13("input_double_register_13"), /**/
    input_double_register_14("input_double_register_14"), /**/
    input_double_register_15("input_double_register_15"), /**/
    input_double_register_16("input_double_register_16"), /**/
    input_double_register_17("input_double_register_17"), /**/
    input_double_register_18("input_double_register_18"), /**/
    input_double_register_19("input_double_register_19"), /**/
    input_double_register_20("input_double_register_20"), /**/
    input_double_register_21("input_double_register_21"), /**/
    input_double_register_22("input_double_register_22"), /**/
    input_double_register_23("input_double_register_23"), /**/
    input_double_register_24("input_double_register_24"), /**/
    input_double_register_25("input_double_register_25"), /**/
    input_double_register_26("input_double_register_26"), /**/
    input_double_register_27("input_double_register_27"), /**/
    input_double_register_28("input_double_register_28"), /**/
    input_double_register_29("input_double_register_29"), /**/
    input_double_register_30("input_double_register_30"), /**/
    input_double_register_31("input_double_register_31"), /**/
    input_double_register_32("input_double_register_32"), /**/
    input_double_register_33("input_double_register_33"), /**/
    input_double_register_34("input_double_register_34"), /**/
    input_double_register_35("input_double_register_35"), /**/
    input_double_register_36("input_double_register_36"), /**/
    input_double_register_37("input_double_register_37"), /**/
    input_double_register_38("input_double_register_38"), /**/
    input_double_register_39("input_double_register_39"), /**/
    input_double_register_40("input_double_register_40"), /**/
    input_double_register_41("input_double_register_41"), /**/
    input_double_register_42("input_double_register_42"), /**/
    input_double_register_43("input_double_register_43"), /**/
    input_double_register_44("input_double_register_44"), /**/
    input_double_register_45("input_double_register_45"), /**/
    input_double_register_46("input_double_register_46"), /**/
    input_double_register_47("input_double_register_47"), /**/
    tool_output_mode("tool_output_mode"), /**/
    tool_digital_output0_mode("tool_digital_output0_mode"), /**/
    tool_digital_output1_mode("tool_digital_output1_mode"); /**/

    private String type;

    private RTDEOutput(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
