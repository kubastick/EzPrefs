# EzPrefs
One-line android shared prefs api wrapper
## Usage
Setting values
```
EzPrefs.putBoolean(key,value,getApplicationContext();
EzPrefs.putString(key,value,getApplicationContext();
EzPrefs.putInteger(key,value,getApplicationContext();
```
Getting values
```
EzPrefs.getBoolean(key,getApplicationContext());
EzPrefs.getString(key,getApplicationContext());
EzPrefs.getInt(key,getApplicationContext());
```
## Example usage
`EasyPrefs.getBoolean("showPreview",getApplicationContext())`
`EasyPrefs.putBoolean("aAds",true,getApplicationContext());`
## Instalation
Just copy .java file to your src/java/com/jakubtomana/ folder in android project.
