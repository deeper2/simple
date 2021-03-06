/*
 * Copyright 2014 Matteo Catena
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nudt.codes.gvint;

public class DecodeFunctions {

	/*
	 * Unfortunately, this big switch seems to be a huge bottleneck! :-(
	 */
	
	protected final int decode(final int[] in, final int inOffset,
			final int code, final int[] out, final int outOffset) {

		switch (code) {
		case 0:
			return decode0(in, inOffset, out, outOffset);
		case 1:
			return decode1(in, inOffset, out, outOffset);
		case 2:
			return decode2(in, inOffset, out, outOffset);
		case 3:
			return decode3(in, inOffset, out, outOffset);
		case 4:
			return decode4(in, inOffset, out, outOffset);
		case 5:
			return decode5(in, inOffset, out, outOffset);
		case 6:
			return decode6(in, inOffset, out, outOffset);
		case 7:
			return decode7(in, inOffset, out, outOffset);
		case 8:
			return decode8(in, inOffset, out, outOffset);
		case 9:
			return decode9(in, inOffset, out, outOffset);
		case 10:
			return decode10(in, inOffset, out, outOffset);
		case 11:
			return decode11(in, inOffset, out, outOffset);
		case 12:
			return decode12(in, inOffset, out, outOffset);
		case 13:
			return decode13(in, inOffset, out, outOffset);
		case 14:
			return decode14(in, inOffset, out, outOffset);
		case 15:
			return decode15(in, inOffset, out, outOffset);
		case 16:
			return decode16(in, inOffset, out, outOffset);
		case 17:
			return decode17(in, inOffset, out, outOffset);
		case 18:
			return decode18(in, inOffset, out, outOffset);
		case 19:
			return decode19(in, inOffset, out, outOffset);
		case 20:
			return decode20(in, inOffset, out, outOffset);
		case 21:
			return decode21(in, inOffset, out, outOffset);
		case 22:
			return decode22(in, inOffset, out, outOffset);
		case 23:
			return decode23(in, inOffset, out, outOffset);
		case 24:
			return decode24(in, inOffset, out, outOffset);
		case 25:
			return decode25(in, inOffset, out, outOffset);
		case 26:
			return decode26(in, inOffset, out, outOffset);
		case 27:
			return decode27(in, inOffset, out, outOffset);
		case 28:
			return decode28(in, inOffset, out, outOffset);
		case 29:
			return decode29(in, inOffset, out, outOffset);
		case 30:
			return decode30(in, inOffset, out, outOffset);
		case 31:
			return decode31(in, inOffset, out, outOffset);
		case 32:
			return decode32(in, inOffset, out, outOffset);
		case 33:
			return decode33(in, inOffset, out, outOffset);
		case 34:
			return decode34(in, inOffset, out, outOffset);
		case 35:
			return decode35(in, inOffset, out, outOffset);
		case 36:
			return decode36(in, inOffset, out, outOffset);
		case 37:
			return decode37(in, inOffset, out, outOffset);
		case 38:
			return decode38(in, inOffset, out, outOffset);
		case 39:
			return decode39(in, inOffset, out, outOffset);
		case 40:
			return decode40(in, inOffset, out, outOffset);
		case 41:
			return decode41(in, inOffset, out, outOffset);
		case 42:
			return decode42(in, inOffset, out, outOffset);
		case 43:
			return decode43(in, inOffset, out, outOffset);
		case 44:
			return decode44(in, inOffset, out, outOffset);
		case 45:
			return decode45(in, inOffset, out, outOffset);
		case 46:
			return decode46(in, inOffset, out, outOffset);
		case 47:
			return decode47(in, inOffset, out, outOffset);
		case 48:
			return decode48(in, inOffset, out, outOffset);
		case 49:
			return decode49(in, inOffset, out, outOffset);
		case 50:
			return decode50(in, inOffset, out, outOffset);
		case 51:
			return decode51(in, inOffset, out, outOffset);
		case 52:
			return decode52(in, inOffset, out, outOffset);
		case 53:
			return decode53(in, inOffset, out, outOffset);
		case 54:
			return decode54(in, inOffset, out, outOffset);
		case 55:
			return decode55(in, inOffset, out, outOffset);
		case 56:
			return decode56(in, inOffset, out, outOffset);
		case 57:
			return decode57(in, inOffset, out, outOffset);
		case 58:
			return decode58(in, inOffset, out, outOffset);
		case 59:
			return decode59(in, inOffset, out, outOffset);
		case 60:
			return decode60(in, inOffset, out, outOffset);
		case 61:
			return decode61(in, inOffset, out, outOffset);
		case 62:
			return decode62(in, inOffset, out, outOffset);
		case 63:
			return decode63(in, inOffset, out, outOffset);
		case 64:
			return decode64(in, inOffset, out, outOffset);
		case 65:
			return decode65(in, inOffset, out, outOffset);
		case 66:
			return decode66(in, inOffset, out, outOffset);
		case 67:
			return decode67(in, inOffset, out, outOffset);
		case 68:
			return decode68(in, inOffset, out, outOffset);
		case 69:
			return decode69(in, inOffset, out, outOffset);
		case 70:
			return decode70(in, inOffset, out, outOffset);
		case 71:
			return decode71(in, inOffset, out, outOffset);
		case 72:
			return decode72(in, inOffset, out, outOffset);
		case 73:
			return decode73(in, inOffset, out, outOffset);
		case 74:
			return decode74(in, inOffset, out, outOffset);
		case 75:
			return decode75(in, inOffset, out, outOffset);
		case 76:
			return decode76(in, inOffset, out, outOffset);
		case 77:
			return decode77(in, inOffset, out, outOffset);
		case 78:
			return decode78(in, inOffset, out, outOffset);
		case 79:
			return decode79(in, inOffset, out, outOffset);
		case 80:
			return decode80(in, inOffset, out, outOffset);
		case 81:
			return decode81(in, inOffset, out, outOffset);
		case 82:
			return decode82(in, inOffset, out, outOffset);
		case 83:
			return decode83(in, inOffset, out, outOffset);
		case 84:
			return decode84(in, inOffset, out, outOffset);
		case 85:
			return decode85(in, inOffset, out, outOffset);
		case 86:
			return decode86(in, inOffset, out, outOffset);
		case 87:
			return decode87(in, inOffset, out, outOffset);
		case 88:
			return decode88(in, inOffset, out, outOffset);
		case 89:
			return decode89(in, inOffset, out, outOffset);
		case 90:
			return decode90(in, inOffset, out, outOffset);
		case 91:
			return decode91(in, inOffset, out, outOffset);
		case 92:
			return decode92(in, inOffset, out, outOffset);
		case 93:
			return decode93(in, inOffset, out, outOffset);
		case 94:
			return decode94(in, inOffset, out, outOffset);
		case 95:
			return decode95(in, inOffset, out, outOffset);
		case 96:
			return decode96(in, inOffset, out, outOffset);
		case 97:
			return decode97(in, inOffset, out, outOffset);
		case 98:
			return decode98(in, inOffset, out, outOffset);
		case 99:
			return decode99(in, inOffset, out, outOffset);
		case 100:
			return decode100(in, inOffset, out, outOffset);
		case 101:
			return decode101(in, inOffset, out, outOffset);
		case 102:
			return decode102(in, inOffset, out, outOffset);
		case 103:
			return decode103(in, inOffset, out, outOffset);
		case 104:
			return decode104(in, inOffset, out, outOffset);
		case 105:
			return decode105(in, inOffset, out, outOffset);
		case 106:
			return decode106(in, inOffset, out, outOffset);
		case 107:
			return decode107(in, inOffset, out, outOffset);
		case 108:
			return decode108(in, inOffset, out, outOffset);
		case 109:
			return decode109(in, inOffset, out, outOffset);
		case 110:
			return decode110(in, inOffset, out, outOffset);
		case 111:
			return decode111(in, inOffset, out, outOffset);
		case 112:
			return decode112(in, inOffset, out, outOffset);
		case 113:
			return decode113(in, inOffset, out, outOffset);
		case 114:
			return decode114(in, inOffset, out, outOffset);
		case 115:
			return decode115(in, inOffset, out, outOffset);
		case 116:
			return decode116(in, inOffset, out, outOffset);
		case 117:
			return decode117(in, inOffset, out, outOffset);
		case 118:
			return decode118(in, inOffset, out, outOffset);
		case 119:
			return decode119(in, inOffset, out, outOffset);
		case 120:
			return decode120(in, inOffset, out, outOffset);
		case 121:
			return decode121(in, inOffset, out, outOffset);
		case 122:
			return decode122(in, inOffset, out, outOffset);
		case 123:
			return decode123(in, inOffset, out, outOffset);
		case 124:
			return decode124(in, inOffset, out, outOffset);
		case 125:
			return decode125(in, inOffset, out, outOffset);
		case 126:
			return decode126(in, inOffset, out, outOffset);
		case 127:
			return decode127(in, inOffset, out, outOffset);
		case 128:
			return decode128(in, inOffset, out, outOffset);
		case 129:
			return decode129(in, inOffset, out, outOffset);
		case 130:
			return decode130(in, inOffset, out, outOffset);
		case 131:
			return decode131(in, inOffset, out, outOffset);
		case 132:
			return decode132(in, inOffset, out, outOffset);
		case 133:
			return decode133(in, inOffset, out, outOffset);
		case 134:
			return decode134(in, inOffset, out, outOffset);
		case 135:
			return decode135(in, inOffset, out, outOffset);
		case 136:
			return decode136(in, inOffset, out, outOffset);
		case 137:
			return decode137(in, inOffset, out, outOffset);
		case 138:
			return decode138(in, inOffset, out, outOffset);
		case 139:
			return decode139(in, inOffset, out, outOffset);
		case 140:
			return decode140(in, inOffset, out, outOffset);
		case 141:
			return decode141(in, inOffset, out, outOffset);
		case 142:
			return decode142(in, inOffset, out, outOffset);
		case 143:
			return decode143(in, inOffset, out, outOffset);
		case 144:
			return decode144(in, inOffset, out, outOffset);
		case 145:
			return decode145(in, inOffset, out, outOffset);
		case 146:
			return decode146(in, inOffset, out, outOffset);
		case 147:
			return decode147(in, inOffset, out, outOffset);
		case 148:
			return decode148(in, inOffset, out, outOffset);
		case 149:
			return decode149(in, inOffset, out, outOffset);
		case 150:
			return decode150(in, inOffset, out, outOffset);
		case 151:
			return decode151(in, inOffset, out, outOffset);
		case 152:
			return decode152(in, inOffset, out, outOffset);
		case 153:
			return decode153(in, inOffset, out, outOffset);
		case 154:
			return decode154(in, inOffset, out, outOffset);
		case 155:
			return decode155(in, inOffset, out, outOffset);
		case 156:
			return decode156(in, inOffset, out, outOffset);
		case 157:
			return decode157(in, inOffset, out, outOffset);
		case 158:
			return decode158(in, inOffset, out, outOffset);
		case 159:
			return decode159(in, inOffset, out, outOffset);
		case 160:
			return decode160(in, inOffset, out, outOffset);
		case 161:
			return decode161(in, inOffset, out, outOffset);
		case 162:
			return decode162(in, inOffset, out, outOffset);
		case 163:
			return decode163(in, inOffset, out, outOffset);
		case 164:
			return decode164(in, inOffset, out, outOffset);
		case 165:
			return decode165(in, inOffset, out, outOffset);
		case 166:
			return decode166(in, inOffset, out, outOffset);
		case 167:
			return decode167(in, inOffset, out, outOffset);
		case 168:
			return decode168(in, inOffset, out, outOffset);
		case 169:
			return decode169(in, inOffset, out, outOffset);
		case 170:
			return decode170(in, inOffset, out, outOffset);
		case 171:
			return decode171(in, inOffset, out, outOffset);
		case 172:
			return decode172(in, inOffset, out, outOffset);
		case 173:
			return decode173(in, inOffset, out, outOffset);
		case 174:
			return decode174(in, inOffset, out, outOffset);
		case 175:
			return decode175(in, inOffset, out, outOffset);
		case 176:
			return decode176(in, inOffset, out, outOffset);
		case 177:
			return decode177(in, inOffset, out, outOffset);
		case 178:
			return decode178(in, inOffset, out, outOffset);
		case 179:
			return decode179(in, inOffset, out, outOffset);
		case 180:
			return decode180(in, inOffset, out, outOffset);
		case 181:
			return decode181(in, inOffset, out, outOffset);
		case 182:
			return decode182(in, inOffset, out, outOffset);
		case 183:
			return decode183(in, inOffset, out, outOffset);
		case 184:
			return decode184(in, inOffset, out, outOffset);
		case 185:
			return decode185(in, inOffset, out, outOffset);
		case 186:
			return decode186(in, inOffset, out, outOffset);
		case 187:
			return decode187(in, inOffset, out, outOffset);
		case 188:
			return decode188(in, inOffset, out, outOffset);
		case 189:
			return decode189(in, inOffset, out, outOffset);
		case 190:
			return decode190(in, inOffset, out, outOffset);
		case 191:
			return decode191(in, inOffset, out, outOffset);
		case 192:
			return decode192(in, inOffset, out, outOffset);
		case 193:
			return decode193(in, inOffset, out, outOffset);
		case 194:
			return decode194(in, inOffset, out, outOffset);
		case 195:
			return decode195(in, inOffset, out, outOffset);
		case 196:
			return decode196(in, inOffset, out, outOffset);
		case 197:
			return decode197(in, inOffset, out, outOffset);
		case 198:
			return decode198(in, inOffset, out, outOffset);
		case 199:
			return decode199(in, inOffset, out, outOffset);
		case 200:
			return decode200(in, inOffset, out, outOffset);
		case 201:
			return decode201(in, inOffset, out, outOffset);
		case 202:
			return decode202(in, inOffset, out, outOffset);
		case 203:
			return decode203(in, inOffset, out, outOffset);
		case 204:
			return decode204(in, inOffset, out, outOffset);
		case 205:
			return decode205(in, inOffset, out, outOffset);
		case 206:
			return decode206(in, inOffset, out, outOffset);
		case 207:
			return decode207(in, inOffset, out, outOffset);
		case 208:
			return decode208(in, inOffset, out, outOffset);
		case 209:
			return decode209(in, inOffset, out, outOffset);
		case 210:
			return decode210(in, inOffset, out, outOffset);
		case 211:
			return decode211(in, inOffset, out, outOffset);
		case 212:
			return decode212(in, inOffset, out, outOffset);
		case 213:
			return decode213(in, inOffset, out, outOffset);
		case 214:
			return decode214(in, inOffset, out, outOffset);
		case 215:
			return decode215(in, inOffset, out, outOffset);
		case 216:
			return decode216(in, inOffset, out, outOffset);
		case 217:
			return decode217(in, inOffset, out, outOffset);
		case 218:
			return decode218(in, inOffset, out, outOffset);
		case 219:
			return decode219(in, inOffset, out, outOffset);
		case 220:
			return decode220(in, inOffset, out, outOffset);
		case 221:
			return decode221(in, inOffset, out, outOffset);
		case 222:
			return decode222(in, inOffset, out, outOffset);
		case 223:
			return decode223(in, inOffset, out, outOffset);
		case 224:
			return decode224(in, inOffset, out, outOffset);
		case 225:
			return decode225(in, inOffset, out, outOffset);
		case 226:
			return decode226(in, inOffset, out, outOffset);
		case 227:
			return decode227(in, inOffset, out, outOffset);
		case 228:
			return decode228(in, inOffset, out, outOffset);
		case 229:
			return decode229(in, inOffset, out, outOffset);
		case 230:
			return decode230(in, inOffset, out, outOffset);
		case 231:
			return decode231(in, inOffset, out, outOffset);
		case 232:
			return decode232(in, inOffset, out, outOffset);
		case 233:
			return decode233(in, inOffset, out, outOffset);
		case 234:
			return decode234(in, inOffset, out, outOffset);
		case 235:
			return decode235(in, inOffset, out, outOffset);
		case 236:
			return decode236(in, inOffset, out, outOffset);
		case 237:
			return decode237(in, inOffset, out, outOffset);
		case 238:
			return decode238(in, inOffset, out, outOffset);
		case 239:
			return decode239(in, inOffset, out, outOffset);
		case 240:
			return decode240(in, inOffset, out, outOffset);
		case 241:
			return decode241(in, inOffset, out, outOffset);
		case 242:
			return decode242(in, inOffset, out, outOffset);
		case 243:
			return decode243(in, inOffset, out, outOffset);
		case 244:
			return decode244(in, inOffset, out, outOffset);
		case 245:
			return decode245(in, inOffset, out, outOffset);
		case 246:
			return decode246(in, inOffset, out, outOffset);
		case 247:
			return decode247(in, inOffset, out, outOffset);
		case 248:
			return decode248(in, inOffset, out, outOffset);
		case 249:
			return decode249(in, inOffset, out, outOffset);
		case 250:
			return decode250(in, inOffset, out, outOffset);
		case 251:
			return decode251(in, inOffset, out, outOffset);
		case 252:
			return decode252(in, inOffset, out, outOffset);
		case 253:
			return decode253(in, inOffset, out, outOffset);
		case 254:
			return decode254(in, inOffset, out, outOffset);
		case 255:
			return decode255(in, inOffset, out, outOffset);
		default:
			throw new RuntimeException("Wrong code: " + code);
		}
	}

	private int decode0(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = 0xFF & in[inOffset + 2];
		out[outOffset + 3] = 0xFF & in[inOffset + 3];
		return 4;
	}

	private int decode1(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = 0xFF & in[inOffset + 2];
		out[outOffset + 3] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		return 5;
	}

	private int decode2(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = 0xFF & in[inOffset + 2];
		out[outOffset + 3] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		return 6;
	}

	private int decode3(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = 0xFF & in[inOffset + 2];
		out[outOffset + 3] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode4(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 3] = 0xFF & in[inOffset + 4];
		return 5;
	}

	private int decode5(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		return 6;
	}

	private int decode6(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode7(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode8(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private int decode9(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode10(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode11(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode12(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode13(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode14(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode15(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode16(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = 0xFF & in[inOffset + 4];
		return 5;
	}

	private int decode17(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		return 6;
	}

	private int decode18(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode19(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode20(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private int decode21(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode22(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode23(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode24(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode25(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode26(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode27(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode28(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode29(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode30(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode31(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode32(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private int decode33(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode34(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode35(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode36(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode37(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode38(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode39(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode40(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode41(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode42(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode43(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode44(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode45(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode46(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode47(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode48(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode49(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode50(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode51(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode52(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode53(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode54(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode55(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode56(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode57(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode58(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode59(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode60(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode61(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode62(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode63(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode64(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = 0xFF & in[inOffset + 4];
		return 5;
	}

	private int decode65(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		return 6;
	}

	private int decode66(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode67(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode68(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private int decode69(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode70(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode71(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode72(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode73(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode74(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode75(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode76(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode77(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode78(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode79(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode80(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private int decode81(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode82(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode83(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode84(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode85(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode86(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode87(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode88(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode89(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode90(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode91(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode92(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode93(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode94(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode95(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode96(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode97(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode98(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode99(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode100(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode101(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode102(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode103(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode104(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode105(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode106(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode107(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode108(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode109(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode110(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode111(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode112(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode113(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode114(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode115(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode116(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode117(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode118(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode119(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode120(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode121(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode122(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode123(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode124(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = 0xFF & in[inOffset + 10];
		return 11;
	}

	private int decode125(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode126(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode127(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
				| ((0xFF & in[inOffset + 11]) << 16)
				| ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode128(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private int decode129(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private int decode130(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode131(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode132(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode133(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode134(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode135(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode136(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode137(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode138(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode139(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode140(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode141(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode142(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode143(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode144(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode145(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode146(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode147(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode148(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode149(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode150(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode151(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode152(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode153(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode154(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode155(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode156(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode157(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode158(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode159(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode160(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode161(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode162(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode163(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode164(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode165(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode166(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode167(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode168(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode169(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode170(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode171(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode172(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = 0xFF & in[inOffset + 10];
		return 11;
	}

	private int decode173(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode174(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode175(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
				| ((0xFF & in[inOffset + 11]) << 16)
				| ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode176(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode177(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode178(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode179(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode180(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode181(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode182(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode183(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode184(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = 0xFF & in[inOffset + 10];
		return 11;
	}

	private int decode185(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode186(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode187(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
				| ((0xFF & in[inOffset + 11]) << 16)
				| ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode188(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = 0xFF & in[inOffset + 11];
		return 12;
	}

	private int decode189(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode190(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 16)
				| ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode191(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 24)
				| ((0xFF & in[inOffset + 12]) << 16)
				| ((0xFF & in[inOffset + 13]) << 8)
				| (0xFF & in[inOffset + 14]);
		return 15;
	}

	private int decode192(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private int decode193(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private int decode194(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode195(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode196(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode197(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode198(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode199(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode200(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode201(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode202(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode203(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode204(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode205(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode206(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode207(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode208(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private int decode209(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private int decode210(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode211(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode212(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode213(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode214(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode215(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode216(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode217(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode218(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode219(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode220(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = 0xFF & in[inOffset + 10];
		return 11;
	}

	private int decode221(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode222(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode223(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
				| ((0xFF & in[inOffset + 11]) << 16)
				| ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode224(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private int decode225(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private int decode226(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode227(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode228(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode229(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode230(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode231(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode232(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = 0xFF & in[inOffset + 10];
		return 11;
	}

	private int decode233(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode234(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode235(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
				| ((0xFF & in[inOffset + 11]) << 16)
				| ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode236(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = 0xFF & in[inOffset + 11];
		return 12;
	}

	private int decode237(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode238(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 16)
				| ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode239(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 24)
				| ((0xFF & in[inOffset + 12]) << 16)
				| ((0xFF & in[inOffset + 13]) << 8)
				| (0xFF & in[inOffset + 14]);
		return 15;
	}

	private int decode240(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = 0xFF & in[inOffset + 8];
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private int decode241(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = 0xFF & in[inOffset + 8];
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private int decode242(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = 0xFF & in[inOffset + 8];
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode243(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = 0xFF & in[inOffset + 8];
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
				| ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode244(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = 0xFF & in[inOffset + 10];
		return 11;
	}

	private int decode245(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		return 12;
	}

	private int decode246(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
				| ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode247(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
				| ((0xFF & in[inOffset + 11]) << 16)
				| ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode248(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = 0xFF & in[inOffset + 11];
		return 12;
	}

	private int decode249(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 8)
				| (0xFF & in[inOffset + 12]);
		return 13;
	}

	private int decode250(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 16)
				| ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode251(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 24)
				| ((0xFF & in[inOffset + 12]) << 16)
				| ((0xFF & in[inOffset + 13]) << 8)
				| (0xFF & in[inOffset + 14]);
		return 15;
	}

	private int decode252(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		out[outOffset + 3] = 0xFF & in[inOffset + 12];
		return 13;
	}

	private int decode253(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 12]) << 8)
				| (0xFF & in[inOffset + 13]);
		return 14;
	}

	private int decode254(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 12]) << 16)
				| ((0xFF & in[inOffset + 13]) << 8)
				| (0xFF & in[inOffset + 14]);
		return 15;
	}

	private int decode255(final int[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 24)
				| ((0xFF & in[inOffset + 9]) << 16)
				| ((0xFF & in[inOffset + 10]) << 8)
				| (0xFF & in[inOffset + 11]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 12]) << 24)
				| ((0xFF & in[inOffset + 13]) << 16)
				| ((0xFF & in[inOffset + 14]) << 8)
				| (0xFF & in[inOffset + 15]);
		return 16;
	}

	protected final int readUncompressedInt(int[] in, int inOffset) {

		int i = (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset] & 0xFF);

		return i;
	}

}