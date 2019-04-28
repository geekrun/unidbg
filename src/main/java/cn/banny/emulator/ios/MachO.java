package cn.banny.emulator.ios;

interface MachO {

    long CPU_SUBTYPE_ARM_V7 = 9;

    int SECTION_TYPE = 0x000000ff;
    int S_ZEROFILL = 0x1;
    int S_NON_LAZY_SYMBOL_POINTERS = 0x6;
    int S_LAZY_SYMBOL_POINTERS = 0x7;
    int S_MOD_INIT_FUNC_POINTERS = 0x9;

    long INDIRECT_SYMBOL_ABS = 0x40000000L;
    long INDIRECT_SYMBOL_LOCAL = 0x80000000L;

    int NO_SECT = 0;
    int N_TYPE = 0x0e;
    int N_STAB = 0xe0;
    int N_UNDF = 0;
    int N_SECT = 0xe;
    int N_INDR = 0xa;

    int N_ARM_THUMB_DEF = 0x8; /* symbol is a Thumb function (ARM) */
    int N_WEAK_REF = 0x0040; /* symbol is weak referenced */
    int N_WEAK_DEF = 0x0080; /* coalesed symbol is a weak definition */

    int ARM_RELOC_VANILLA = 0; /* generic relocation as discribed above */

    int EXPORT_SYMBOL_FLAGS_REEXPORT = 0x08;
    int EXPORT_SYMBOL_FLAGS_STUB_AND_RESOLVER = 0x10;

    int REBASE_TYPE_POINTER = 1;
    int REBASE_TYPE_TEXT_ABSOLUTE32 = 2;

    int REBASE_IMMEDIATE_MASK = 0x0f;
    int REBASE_OPCODE_MASK = 0xf0;
    int REBASE_OPCODE_DONE = 0x00;
    int REBASE_OPCODE_SET_TYPE_IMM = 0x10;
    int REBASE_OPCODE_SET_SEGMENT_AND_OFFSET_ULEB = 0x20;
    int REBASE_OPCODE_ADD_ADDR_ULEB = 0x30;
    int REBASE_OPCODE_ADD_ADDR_IMM_SCALED = 0x40;
    int REBASE_OPCODE_DO_REBASE_IMM_TIMES = 0x50;
    int REBASE_OPCODE_DO_REBASE_ULEB_TIMES = 0x60;
    int REBASE_OPCODE_DO_REBASE_ADD_ADDR_ULEB = 0x70;
    int REBASE_OPCODE_DO_REBASE_ULEB_TIMES_SKIPPING_ULEB = 0x80;

}
