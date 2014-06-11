/**
 * Copyright 2014 Marek Matejka
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

package marek.matejka.logotextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Class that extends TextView and uses FontAwesome
 * (http://fontawesome.io/icons/) to show characters which can be used as a
 * replacement of some graphics in your application.
 * 
 * @author Marek Matejka
 * @see {@link http://fontawesome.io/icons/} for more icons.
 */
public class LogoTextView extends TextView {

	/**
	 * General constructor for the LogoTextView view.
	 * 
	 * @param context
	 *            Context of the application.
	 * @param attrs
	 *            AttributeSet defined through XML.
	 */
	public LogoTextView(Context context, AttributeSet attrs) {
		super(context, attrs);

		// get the logo type code
		TypedArray a = context.obtainStyledAttributes(attrs,
				R.styleable.LogoTextView);
		int code = a.getInteger(R.styleable.LogoTextView_logo_type, -1); // -1 =
																			// default
																			// value
		a.recycle();

		// sets the logo
		this.setText(Html.fromHtml(getLogo(code)));

		// set the font to be FontAwesome
		this.setTypeface(Typeface.createFromAsset(context.getAssets(),
				"fonts/font_awesome.otf"));

		this.setClickable(true);
		this.setFocusable(true);
	}

	/**
	 * Returns Unicode of the logo type.
	 * 
	 * If you want to add another logo, go to <i>res/attrs.xml</i> create a new
	 * <i>enum</i> for it with a unique integer value, and add another
	 * <i>case</i> statement to this code with Unicode value as the return
	 * string.
	 * 
	 * @param code
	 *            Logo type code.
	 * @return Unicode for the logo.
	 * @see {@link http://fortawesome.github.io/Font-Awesome/cheatsheet/} for
	 *      Unicode values of FontAwesome characters.
	 */
	private String getLogo(int code) {
		switch (code) {
		case 1:
			return "&#xf042;"; // adjust
		case 2:
			return "&#xf170;"; // adn
		case 3:
			return "&#xf037;"; // align-center
		case 4:
			return "&#xf039;"; // align-justify
		case 5:
			return "&#xf036;"; // align-left
		case 6:
			return "&#xf038;"; // align-right
		case 7:
			return "&#xf0f9;"; // ambulance
		case 8:
			return "&#xf13d;"; // anchor
		case 9:
			return "&#xf17b;"; // android
		case 10:
			return "&#xf103;"; // angle-double-down
		case 11:
			return "&#xf100;"; // angle-double-left
		case 12:
			return "&#xf101;"; // angle-double-right
		case 13:
			return "&#xf102;"; // angle-double-up
		case 14:
			return "&#xf107;"; // angle-down
		case 15:
			return "&#xf104;"; // angle-left
		case 16:
			return "&#xf105;"; // angle-right
		case 17:
			return "&#xf106;"; // angle-up
		case 18:
			return "&#xf179;"; // apple
		case 19:
			return "&#xf187;"; // archive
		case 20:
			return "&#xf0ab;"; // arrow-circle-down
		case 21:
			return "&#xf0a8;"; // arrow-circle-left
		case 22:
			return "&#xf01a;"; // arrow-circle-o-down
		case 23:
			return "&#xf190;"; // arrow-circle-o-left
		case 24:
			return "&#xf18e;"; // arrow-circle-o-right
		case 25:
			return "&#xf01b;"; // arrow-circle-o-up
		case 26:
			return "&#xf0a9;"; // arrow-circle-right
		case 27:
			return "&#xf0aa;"; // arrow-circle-up
		case 28:
			return "&#xf063;"; // arrow-down
		case 29:
			return "&#xf060;"; // arrow-left
		case 30:
			return "&#xf061;"; // arrow-right
		case 31:
			return "&#xf062;"; // arrow-up
		case 32:
			return "&#xf047;"; // arrows
		case 33:
			return "&#xf0b2;"; // arrows-alt
		case 34:
			return "&#xf07e;"; // arrows-h
		case 35:
			return "&#xf07d;"; // arrows-v
		case 36:
			return "&#xf069;"; // asterisk
		case 37:
			return "&#xf1b9;"; // automobile
		case 38:
			return "&#xf04a;"; // backward
		case 39:
			return "&#xf05e;"; // ban
		case 40:
			return "&#xf19c;"; // bank
		case 41:
			return "&#xf080;"; // bar-chart-o
		case 42:
			return "&#xf02a;"; // barcode
		case 43:
			return "&#xf0c9;"; // bars
		case 44:
			return "&#xf0fc;"; // beer
		case 45:
			return "&#xf1b4;"; // behance
		case 46:
			return "&#xf1b5;"; // behance-square
		case 47:
			return "&#xf0f3;"; // bell
		case 48:
			return "&#xf0a2;"; // bell-o
		case 49:
			return "&#xf171;"; // bitbucket
		case 50:
			return "&#xf172;"; // bitbucket-square
		case 51:
			return "&#xf15a;"; // bitcoin
		case 52:
			return "&#xf032;"; // bold
		case 53:
			return "&#xf0e7;"; // bolt
		case 54:
			return "&#xf1e2;"; // bomb
		case 55:
			return "&#xf02d;"; // book
		case 56:
			return "&#xf02e;"; // bookmark
		case 57:
			return "&#xf097;"; // bookmark-o
		case 58:
			return "&#xf0b1;"; // briefcase
		case 59:
			return "&#xf15a;"; // btc
		case 60:
			return "&#xf188;"; // bug
		case 61:
			return "&#xf1ad;"; // building
		case 62:
			return "&#xf0f7;"; // building-o
		case 63:
			return "&#xf0a1;"; // bullhorn
		case 64:
			return "&#xf140;"; // bullseye
		case 65:
			return "&#xf1ba;"; // cab
		case 66:
			return "&#xf073;"; // calendar
		case 67:
			return "&#xf133;"; // calendar-o
		case 68:
			return "&#xf030;"; // camera
		case 69:
			return "&#xf083;"; // camera-retro
		case 70:
			return "&#xf1b9;"; // car
		case 71:
			return "&#xf0d7;"; // caret-down
		case 72:
			return "&#xf0d9;"; // caret-left
		case 73:
			return "&#xf0da;"; // caret-right
		case 74:
			return "&#xf150;"; // caret-square-o-down
		case 75:
			return "&#xf191;"; // caret-square-o-left
		case 76:
			return "&#xf152;"; // caret-square-o-right
		case 77:
			return "&#xf151;"; // caret-square-o-up
		case 78:
			return "&#xf0d8;"; // caret-up
		case 79:
			return "&#xf0a3;"; // certificate
		case 80:
			return "&#xf0c1;"; // chain
		case 81:
			return "&#xf127;"; // chain-broken
		case 82:
			return "&#xf00c;"; // check
		case 83:
			return "&#xf058;"; // check-circle
		case 84:
			return "&#xf05d;"; // check-circle-o
		case 85:
			return "&#xf14a;"; // check-square
		case 86:
			return "&#xf046;"; // check-square-o
		case 87:
			return "&#xf13a;"; // chevron-circle-down
		case 88:
			return "&#xf137;"; // chevron-circle-left
		case 89:
			return "&#xf138;"; // chevron-circle-right
		case 90:
			return "&#xf139;"; // chevron-circle-up
		case 91:
			return "&#xf078;"; // chevron-down
		case 92:
			return "&#xf053;"; // chevron-left
		case 93:
			return "&#xf054;"; // chevron-right
		case 94:
			return "&#xf077;"; // chevron-up
		case 95:
			return "&#xf1ae;"; // child
		case 96:
			return "&#xf111;"; // circle
		case 97:
			return "&#xf10c;"; // circle-o
		case 98:
			return "&#xf1ce;"; // circle-o-notch
		case 99:
			return "&#xf1db;"; // circle-thin
		case 100:
			return "&#xf0ea;"; // clipboard
		case 101:
			return "&#xf017;"; // clock-o
		case 102:
			return "&#xf0c2;"; // cloud
		case 103:
			return "&#xf0ed;"; // cloud-download
		case 104:
			return "&#xf0ee;"; // cloud-upload
		case 105:
			return "&#xf157;"; // cny
		case 106:
			return "&#xf121;"; // code
		case 107:
			return "&#xf126;"; // code-fork
		case 108:
			return "&#xf1cb;"; // codepen
		case 109:
			return "&#xf0f4;"; // coffee
		case 110:
			return "&#xf013;"; // cog
		case 111:
			return "&#xf085;"; // cogs
		case 112:
			return "&#xf0db;"; // columns
		case 113:
			return "&#xf075;"; // comment
		case 114:
			return "&#xf0e5;"; // comment-o
		case 115:
			return "&#xf086;"; // comments
		case 116:
			return "&#xf0e6;"; // comments-o
		case 117:
			return "&#xf14e;"; // compass
		case 118:
			return "&#xf066;"; // compress
		case 119:
			return "&#xf0c5;"; // copy
		case 120:
			return "&#xf09d;"; // credit-card
		case 121:
			return "&#xf125;"; // crop
		case 122:
			return "&#xf05b;"; // crosshairs
		case 123:
			return "&#xf13c;"; // css3
		case 124:
			return "&#xf1b2;"; // cube
		case 125:
			return "&#xf1b3;"; // cubes
		case 126:
			return "&#xf0c4;"; // cut
		case 127:
			return "&#xf0f5;"; // cutlery
		case 128:
			return "&#xf0e4;"; // dashboard
		case 129:
			return "&#xf1c0;"; // database
		case 130:
			return "&#xf03b;"; // dedent
		case 131:
			return "&#xf1a5;"; // delicious
		case 132:
			return "&#xf108;"; // desktop
		case 133:
			return "&#xf1bd;"; // deviantart
		case 134:
			return "&#xf1a6;"; // digg
		case 135:
			return "&#xf155;"; // dollar
		case 136:
			return "&#xf192;"; // dot-circle-o
		case 137:
			return "&#xf019;"; // download
		case 138:
			return "&#xf17d;"; // dribbble
		case 139:
			return "&#xf16b;"; // dropbox
		case 140:
			return "&#xf1a9;"; // drupal
		case 141:
			return "&#xf044;"; // edit
		case 142:
			return "&#xf052;"; // eject
		case 143:
			return "&#xf141;"; // ellipsis-h
		case 144:
			return "&#xf142;"; // ellipsis-v
		case 145:
			return "&#xf1d1;"; // empire
		case 146:
			return "&#xf0e0;"; // envelope
		case 147:
			return "&#xf003;"; // envelope-o
		case 148:
			return "&#xf199;"; // envelope-square
		case 149:
			return "&#xf12d;"; // eraser
		case 150:
			return "&#xf153;"; // eur
		case 151:
			return "&#xf153;"; // euro
		case 152:
			return "&#xf0ec;"; // exchange
		case 153:
			return "&#xf12a;"; // exclamation
		case 154:
			return "&#xf06a;"; // exclamation-circle
		case 155:
			return "&#xf071;"; // exclamation-triangle
		case 156:
			return "&#xf065;"; // expand
		case 157:
			return "&#xf08e;"; // external-link
		case 158:
			return "&#xf14c;"; // external-link-square
		case 159:
			return "&#xf06e;"; // eye
		case 160:
			return "&#xf070;"; // eye-slash
		case 161:
			return "&#xf09a;"; // facebook
		case 162:
			return "&#xf082;"; // facebook-square
		case 163:
			return "&#xf049;"; // fast-backward
		case 164:
			return "&#xf050;"; // fast-forward
		case 165:
			return "&#xf1ac;"; // fax
		case 166:
			return "&#xf182;"; // female
		case 167:
			return "&#xf0fb;"; // fighter-jet
		case 168:
			return "&#xf15b;"; // file
		case 169:
			return "&#xf1c6;"; // file-archive-o
		case 170:
			return "&#xf1c7;"; // file-audio-o
		case 171:
			return "&#xf1c9;"; // file-code-o
		case 172:
			return "&#xf1c3;"; // file-excel-o
		case 173:
			return "&#xf1c5;"; // file-image-o
		case 174:
			return "&#xf1c8;"; // file-movie-o
		case 175:
			return "&#xf016;"; // file-o
		case 176:
			return "&#xf1c1;"; // file-pdf-o
		case 177:
			return "&#xf1c5;"; // file-photo-o
		case 178:
			return "&#xf1c5;"; // file-picture-o
		case 179:
			return "&#xf1c4;"; // file-powerpoint-o
		case 180:
			return "&#xf1c7;"; // file-sound-o
		case 181:
			return "&#xf15c;"; // file-text
		case 182:
			return "&#xf0f6;"; // file-text-o
		case 183:
			return "&#xf1c8;"; // file-video-o
		case 184:
			return "&#xf1c2;"; // file-word-o
		case 185:
			return "&#xf1c6;"; // file-zip-o
		case 186:
			return "&#xf0c5;"; // files-o
		case 187:
			return "&#xf008;"; // film
		case 188:
			return "&#xf0b0;"; // filter
		case 189:
			return "&#xf06d;"; // fire
		case 190:
			return "&#xf134;"; // fire-extinguisher
		case 191:
			return "&#xf024;"; // flag
		case 192:
			return "&#xf11e;"; // flag-checkered
		case 193:
			return "&#xf11d;"; // flag-o
		case 194:
			return "&#xf0e7;"; // flash
		case 195:
			return "&#xf0c3;"; // flask
		case 196:
			return "&#xf16e;"; // flickr
		case 197:
			return "&#xf0c7;"; // floppy-o
		case 198:
			return "&#xf07b;"; // folder
		case 199:
			return "&#xf114;"; // folder-o
		case 200:
			return "&#xf07c;"; // folder-open
		case 201:
			return "&#xf115;"; // folder-open-o
		case 202:
			return "&#xf031;"; // font
		case 203:
			return "&#xf04e;"; // forward
		case 204:
			return "&#xf180;"; // foursquare
		case 205:
			return "&#xf119;"; // frown-o
		case 206:
			return "&#xf11b;"; // gamepad
		case 207:
			return "&#xf0e3;"; // gavel
		case 208:
			return "&#xf154;"; // gbp
		case 209:
			return "&#xf1d1;"; // ge
		case 210:
			return "&#xf013;"; // gear
		case 211:
			return "&#xf085;"; // gears
		case 212:
			return "&#xf06b;"; // gift
		case 213:
			return "&#xf1d3;"; // git
		case 214:
			return "&#xf1d2;"; // git-square
		case 215:
			return "&#xf09b;"; // github
		case 216:
			return "&#xf113;"; // github-alt
		case 217:
			return "&#xf092;"; // github-square
		case 218:
			return "&#xf184;"; // gittip
		case 219:
			return "&#xf000;"; // glass
		case 220:
			return "&#xf0ac;"; // globe
		case 221:
			return "&#xf1a0;"; // google
		case 222:
			return "&#xf0d5;"; // google-plus
		case 223:
			return "&#xf0d4;"; // google-plus-square
		case 224:
			return "&#xf19d;"; // graduation-cap
		case 225:
			return "&#xf0c0;"; // group
		case 226:
			return "&#xf0fd;"; // h-square
		case 227:
			return "&#xf1d4;"; // hacker-news
		case 228:
			return "&#xf0a7;"; // hand-o-down
		case 229:
			return "&#xf0a5;"; // hand-o-left
		case 230:
			return "&#xf0a4;"; // hand-o-right
		case 231:
			return "&#xf0a6;"; // hand-o-up
		case 232:
			return "&#xf0a0;"; // hdd-o
		case 233:
			return "&#xf1dc;"; // header
		case 234:
			return "&#xf025;"; // headphones
		case 235:
			return "&#xf004;"; // heart
		case 236:
			return "&#xf08a;"; // heart-o
		case 237:
			return "&#xf1da;"; // history
		case 238:
			return "&#xf015;"; // home
		case 239:
			return "&#xf0f8;"; // hospital-o
		case 240:
			return "&#xf13b;"; // html5
		case 241:
			return "&#xf03e;"; // image
		case 242:
			return "&#xf01c;"; // inbox
		case 243:
			return "&#xf03c;"; // indent
		case 244:
			return "&#xf129;"; // info
		case 245:
			return "&#xf05a;"; // info-circle
		case 246:
			return "&#xf156;"; // inr
		case 247:
			return "&#xf16d;"; // instagram
		case 248:
			return "&#xf19c;"; // institution
		case 249:
			return "&#xf033;"; // italic
		case 250:
			return "&#xf1aa;"; // joomla
		case 251:
			return "&#xf157;"; // jpy
		case 252:
			return "&#xf1cc;"; // jsfiddle
		case 253:
			return "&#xf084;"; // key
		case 254:
			return "&#xf11c;"; // keyboard-o
		case 255:
			return "&#xf159;"; // krw
		case 256:
			return "&#xf1ab;"; // language
		case 257:
			return "&#xf109;"; // laptop
		case 258:
			return "&#xf06c;"; // leaf
		case 259:
			return "&#xf0e3;"; // legal
		case 260:
			return "&#xf094;"; // lemon-o
		case 261:
			return "&#xf149;"; // level-down
		case 262:
			return "&#xf148;"; // level-up
		case 263:
			return "&#xf1cd;"; // life-bouy
		case 264:
			return "&#xf1cd;"; // life-ring
		case 265:
			return "&#xf1cd;"; // life-saver
		case 266:
			return "&#xf0eb;"; // lightbulb-o
		case 267:
			return "&#xf0c1;"; // link
		case 268:
			return "&#xf0e1;"; // linkedin
		case 269:
			return "&#xf08c;"; // linkedin-square
		case 270:
			return "&#xf17c;"; // linux
		case 271:
			return "&#xf03a;"; // list
		case 272:
			return "&#xf022;"; // list-alt
		case 273:
			return "&#xf0cb;"; // list-ol
		case 274:
			return "&#xf0ca;"; // list-ul
		case 275:
			return "&#xf124;"; // location-arrow
		case 276:
			return "&#xf023;"; // lock
		case 277:
			return "&#xf175;"; // long-arrow-down
		case 278:
			return "&#xf177;"; // long-arrow-left
		case 279:
			return "&#xf178;"; // long-arrow-right
		case 280:
			return "&#xf176;"; // long-arrow-up
		case 281:
			return "&#xf0d0;"; // magic
		case 282:
			return "&#xf076;"; // magnet
		case 283:
			return "&#xf064;"; // mail-forward
		case 284:
			return "&#xf112;"; // mail-reply
		case 285:
			return "&#xf122;"; // mail-reply-all
		case 286:
			return "&#xf183;"; // male
		case 287:
			return "&#xf041;"; // map-marker
		case 288:
			return "&#xf136;"; // maxcdn
		case 289:
			return "&#xf0fa;"; // medkit
		case 290:
			return "&#xf11a;"; // meh-o
		case 291:
			return "&#xf130;"; // microphone
		case 292:
			return "&#xf131;"; // microphone-slash
		case 293:
			return "&#xf068;"; // minus
		case 294:
			return "&#xf056;"; // minus-circle
		case 295:
			return "&#xf146;"; // minus-square
		case 296:
			return "&#xf147;"; // minus-square-o
		case 297:
			return "&#xf10b;"; // mobile
		case 298:
			return "&#xf10b;"; // mobile-phone
		case 299:
			return "&#xf0d6;"; // money
		case 300:
			return "&#xf186;"; // moon-o
		case 301:
			return "&#xf19d;"; // mortar-board
		case 302:
			return "&#xf001;"; // music
		case 303:
			return "&#xf0c9;"; // navicon
		case 304:
			return "&#xf19b;"; // openid
		case 305:
			return "&#xf03b;"; // outdent
		case 306:
			return "&#xf18c;"; // pagelines
		case 307:
			return "&#xf1d8;"; // paper-plane
		case 308:
			return "&#xf1d9;"; // paper-plane-o
		case 309:
			return "&#xf0c6;"; // paperclip
		case 310:
			return "&#xf1dd;"; // paragraph
		case 311:
			return "&#xf0ea;"; // paste
		case 312:
			return "&#xf04c;"; // pause
		case 313:
			return "&#xf1b0;"; // paw
		case 314:
			return "&#xf040;"; // pencil
		case 315:
			return "&#xf14b;"; // pencil-square
		case 316:
			return "&#xf044;"; // pencil-square-o
		case 317:
			return "&#xf095;"; // phone
		case 318:
			return "&#xf098;"; // phone-square
		case 319:
			return "&#xf03e;"; // photo
		case 320:
			return "&#xf03e;"; // picture-o
		case 321:
			return "&#xf1a7;"; // pied-piper
		case 322:
			return "&#xf1a8;"; // pied-piper-alt
		case 323:
			return "&#xf1a7;"; // pied-piper-square
		case 324:
			return "&#xf0d2;"; // pinterest
		case 325:
			return "&#xf0d3;"; // pinterest-square
		case 326:
			return "&#xf072;"; // plane
		case 327:
			return "&#xf04b;"; // play
		case 328:
			return "&#xf144;"; // play-circle
		case 329:
			return "&#xf01d;"; // play-circle-o
		case 330:
			return "&#xf067;"; // plus
		case 331:
			return "&#xf055;"; // plus-circle
		case 332:
			return "&#xf0fe;"; // plus-square
		case 333:
			return "&#xf196;"; // plus-square-o
		case 334:
			return "&#xf011;"; // power-off
		case 335:
			return "&#xf02f;"; // print
		case 336:
			return "&#xf12e;"; // puzzle-piece
		case 337:
			return "&#xf1d6;"; // qq
		case 338:
			return "&#xf029;"; // qrcode
		case 339:
			return "&#xf128;"; // question
		case 340:
			return "&#xf059;"; // question-circle
		case 341:
			return "&#xf10d;"; // quote-left
		case 342:
			return "&#xf10e;"; // quote-right
		case 343:
			return "&#xf1d0;"; // ra
		case 344:
			return "&#xf074;"; // random
		case 345:
			return "&#xf1d0;"; // rebel
		case 346:
			return "&#xf1b8;"; // recycle
		case 347:
			return "&#xf1a1;"; // reddit
		case 348:
			return "&#xf1a2;"; // reddit-square
		case 349:
			return "&#xf021;"; // refresh
		case 350:
			return "&#xf18b;"; // renren
		case 351:
			return "&#xf0c9;"; // reorder
		case 352:
			return "&#xf01e;"; // repeat
		case 353:
			return "&#xf112;"; // reply
		case 354:
			return "&#xf122;"; // reply-all
		case 355:
			return "&#xf079;"; // retweet
		case 356:
			return "&#xf157;"; // rmb
		case 357:
			return "&#xf018;"; // road
		case 358:
			return "&#xf135;"; // rocket
		case 359:
			return "&#xf0e2;"; // rotate-left
		case 360:
			return "&#xf01e;"; // rotate-right
		case 361:
			return "&#xf158;"; // rouble
		case 362:
			return "&#xf09e;"; // rss
		case 363:
			return "&#xf143;"; // rss-square
		case 364:
			return "&#xf158;"; // rub
		case 365:
			return "&#xf158;"; // ruble
		case 366:
			return "&#xf156;"; // rupee
		case 367:
			return "&#xf0c7;"; // save
		case 368:
			return "&#xf0c4;"; // scissors
		case 369:
			return "&#xf002;"; // search
		case 370:
			return "&#xf010;"; // search-minus
		case 371:
			return "&#xf00e;"; // search-plus
		case 372:
			return "&#xf1d8;"; // send
		case 373:
			return "&#xf1d9;"; // send-o
		case 374:
			return "&#xf064;"; // share
		case 375:
			return "&#xf1e0;"; // share-alt
		case 376:
			return "&#xf1e1;"; // share-alt-square
		case 377:
			return "&#xf14d;"; // share-square
		case 378:
			return "&#xf045;"; // share-square-o
		case 379:
			return "&#xf132;"; // shield
		case 380:
			return "&#xf07a;"; // shopping-cart
		case 381:
			return "&#xf090;"; // sign-in
		case 382:
			return "&#xf08b;"; // sign-out
		case 383:
			return "&#xf012;"; // signal
		case 384:
			return "&#xf0e8;"; // sitemap
		case 385:
			return "&#xf17e;"; // skype
		case 386:
			return "&#xf198;"; // slack
		case 387:
			return "&#xf1de;"; // sliders
		case 388:
			return "&#xf118;"; // smile-o
		case 389:
			return "&#xf0dc;"; // sort
		case 390:
			return "&#xf15d;"; // sort-alpha-asc
		case 391:
			return "&#xf15e;"; // sort-alpha-desc
		case 392:
			return "&#xf160;"; // sort-amount-asc
		case 393:
			return "&#xf161;"; // sort-amount-desc
		case 394:
			return "&#xf0de;"; // sort-asc
		case 395:
			return "&#xf0dd;"; // sort-desc
		case 396:
			return "&#xf0dd;"; // sort-down
		case 397:
			return "&#xf162;"; // sort-numeric-asc
		case 398:
			return "&#xf163;"; // sort-numeric-desc
		case 399:
			return "&#xf0de;"; // sort-up
		case 400:
			return "&#xf1be;"; // soundcloud
		case 401:
			return "&#xf197;"; // space-shuttle
		case 402:
			return "&#xf110;"; // spinner
		case 403:
			return "&#xf1b1;"; // spoon
		case 404:
			return "&#xf1bc;"; // spotify
		case 405:
			return "&#xf0c8;"; // square
		case 406:
			return "&#xf096;"; // square-o
		case 407:
			return "&#xf18d;"; // stack-exchange
		case 408:
			return "&#xf16c;"; // stack-overflow
		case 409:
			return "&#xf005;"; // star
		case 410:
			return "&#xf089;"; // star-half
		case 411:
			return "&#xf123;"; // star-half-empty
		case 412:
			return "&#xf123;"; // star-half-full
		case 413:
			return "&#xf123;"; // star-half-o
		case 414:
			return "&#xf006;"; // star-o
		case 415:
			return "&#xf1b6;"; // steam
		case 416:
			return "&#xf1b7;"; // steam-square
		case 417:
			return "&#xf048;"; // step-backward
		case 418:
			return "&#xf051;"; // step-forward
		case 419:
			return "&#xf0f1;"; // stethoscope
		case 420:
			return "&#xf04d;"; // stop
		case 421:
			return "&#xf0cc;"; // strikethrough
		case 422:
			return "&#xf1a4;"; // stumbleupon
		case 423:
			return "&#xf1a3;"; // stumbleupon-circle
		case 424:
			return "&#xf12c;"; // subscript
		case 425:
			return "&#xf0f2;"; // suitcase
		case 426:
			return "&#xf185;"; // sun-o
		case 427:
			return "&#xf12b;"; // superscript
		case 428:
			return "&#xf1cd;"; // support
		case 429:
			return "&#xf0ce;"; // table
		case 430:
			return "&#xf10a;"; // tablet
		case 431:
			return "&#xf0e4;"; // tachometer
		case 432:
			return "&#xf02b;"; // tag
		case 433:
			return "&#xf02c;"; // tags
		case 434:
			return "&#xf0ae;"; // tasks
		case 435:
			return "&#xf1ba;"; // taxi
		case 436:
			return "&#xf1d5;"; // tencent-weibo
		case 437:
			return "&#xf120;"; // terminal
		case 438:
			return "&#xf034;"; // text-height
		case 439:
			return "&#xf035;"; // text-width
		case 440:
			return "&#xf00a;"; // th
		case 441:
			return "&#xf009;"; // th-large
		case 442:
			return "&#xf00b;"; // th-list
		case 443:
			return "&#xf08d;"; // thumb-tack
		case 444:
			return "&#xf165;"; // thumbs-down
		case 445:
			return "&#xf088;"; // thumbs-o-down
		case 446:
			return "&#xf087;"; // thumbs-o-up
		case 447:
			return "&#xf164;"; // thumbs-up
		case 448:
			return "&#xf145;"; // ticket
		case 449:
			return "&#xf00d;"; // times
		case 450:
			return "&#xf057;"; // times-circle
		case 451:
			return "&#xf05c;"; // times-circle-o
		case 452:
			return "&#xf043;"; // tint
		case 453:
			return "&#xf150;"; // toggle-down
		case 454:
			return "&#xf191;"; // toggle-left
		case 455:
			return "&#xf152;"; // toggle-right
		case 456:
			return "&#xf151;"; // toggle-up
		case 457:
			return "&#xf014;"; // trash-o
		case 458:
			return "&#xf1bb;"; // tree
		case 459:
			return "&#xf181;"; // trello
		case 460:
			return "&#xf091;"; // trophy
		case 461:
			return "&#xf0d1;"; // truck
		case 462:
			return "&#xf195;"; // try_currency
		case 463:
			return "&#xf173;"; // tumblr
		case 464:
			return "&#xf174;"; // tumblr-square
		case 465:
			return "&#xf195;"; // turkish-lira
		case 466:
			return "&#xf099;"; // twitter
		case 467:
			return "&#xf081;"; // twitter-square
		case 468:
			return "&#xf0e9;"; // umbrella
		case 469:
			return "&#xf0cd;"; // underline
		case 470:
			return "&#xf0e2;"; // undo
		case 471:
			return "&#xf19c;"; // university
		case 472:
			return "&#xf127;"; // unlink
		case 473:
			return "&#xf09c;"; // unlock
		case 474:
			return "&#xf13e;"; // unlock-alt
		case 475:
			return "&#xf0dc;"; // unsorted
		case 476:
			return "&#xf093;"; // upload
		case 477:
			return "&#xf155;"; // usd
		case 478:
			return "&#xf007;"; // user
		case 479:
			return "&#xf0f0;"; // user-md
		case 480:
			return "&#xf0c0;"; // users
		case 481:
			return "&#xf03d;"; // video-camera
		case 482:
			return "&#xf194;"; // vimeo-square
		case 483:
			return "&#xf1ca;"; // vine
		case 484:
			return "&#xf189;"; // vk
		case 485:
			return "&#xf027;"; // volume-down
		case 486:
			return "&#xf026;"; // volume-off
		case 487:
			return "&#xf028;"; // volume-up
		case 488:
			return "&#xf071;"; // warning
		case 489:
			return "&#xf1d7;"; // wechat
		case 490:
			return "&#xf18a;"; // weibo
		case 491:
			return "&#xf1d7;"; // weixin
		case 492:
			return "&#xf193;"; // wheelchair
		case 493:
			return "&#xf17a;"; // windows
		case 494:
			return "&#xf159;"; // won
		case 495:
			return "&#xf19a;"; // wordpress
		case 496:
			return "&#xf0ad;"; // wrench
		case 497:
			return "&#xf168;"; // xing
		case 498:
			return "&#xf169;"; // xing-square
		case 499:
			return "&#xf19e;"; // yahoo
		case 500:
			return "&#xf157;"; // yen
		case 501:
			return "&#xf167;"; // youtube
		case 502:
			return "&#xf16a;"; // youtube-play
		case 503:
			return "&#xf166;"; // youtube-square

		default:
			return null;
		}
	}
}