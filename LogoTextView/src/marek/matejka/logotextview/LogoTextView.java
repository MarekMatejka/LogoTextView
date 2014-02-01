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
 * Class that extends TextView and uses FontAwesome (http://fontawesome.io/icons/) to
 * show characters which can be used as a replacement of some graphics in your application.
 * 
 * @author Marek Matejka
 * @see {@link http://fontawesome.io/icons/} for more icons.
 */
public class LogoTextView extends TextView
{		
	
	/**
	 * General constructor for the LogoTextView view.
	 * 
	 * @param context Context of the application.
	 * @param attrs AttributeSet defined through XML.
	 */
	public LogoTextView(Context context, AttributeSet attrs) 
	{
		super(context, attrs);
		
		//get the logo type code
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.LogoTextView);
		int code = a.getInteger(R.styleable.LogoTextView_logo_type, -1); //-1 = default value
		a.recycle();
				
		//sets the logo
		this.setText(Html.fromHtml(getLogo(code))); 
		
		//set the font to be FontAwesome
		this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/font_awesome.otf"));
		
		this.setClickable(true);
		this.setFocusable(true);
	}
	
	/**
	 * Returns Unicode of the logo type.
	 * 
	 * If you want to add another logo, go to <i>res/attrs.xml</i> create a new
	 * <i>enum</i> for it with a unique integer value, and add another <i>case</i>
	 * statement to this code with Unicode value as the return string.
	 * 
	 * @param code Logo type code.
	 * @return Unicode for the logo. 
	 * @see {@link http://fortawesome.github.io/Font-Awesome/cheatsheet/} for Unicode
	 * values of FontAwesome characters.
	 */
	private String getLogo(int code)
	{
		switch(code)
		{
			case 0: return "&#xf015;"; //home
			case 1: return "&#xf0b1;"; //briefcase
			case 2: return "&#xf018;"; //road
			case 3: return "&#xf02c;"; //tags
			case 4: return "&#xf137;"; //left arrow
			case 5: return "&#xf138;"; //right arrow
			default: return null;
		}
	}
}