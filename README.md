About and Benefits
LogoTextView is a simple way to use nice graphics in an Android app without being a good designer. 
It builds on the fact that many fonts are free to use (even for commercial purposes) and that all fonts are vector graphics therefore, they don't lose quality as they scale.
For example Font Awesome (Web: http://fontawesome.io/, GitHub: https://github.com/FortAwesome/Font-Awesome) is a set of 350+ icons that can be used in various ways to support your Android app's graphics.

How to implement LogoTextView to your own project:
1. copy font_awesome.otf or any other font to your assets/fonts folder (you may need to create the fonts folder)
2. copy the LogoTextView class to your project
3. copy the attrs.xml to your res/values folder and define logos you would use - it is easier to work with all the logos this way
4. change values in LogoTextView class's method 'getLogo(int code)'
5. define a new view in your layout file (as shown in activity_main.xml)
6. customize it - add colors, onClick events, ...

