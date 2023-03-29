<body style="background: black; color: white">

# Format

## Programming Language Name

<pre style="color: grey">
######################################
########### Code goes here ###########
######################################
</pre>

`Output`

**Majority of the programmes are Hello World programmes except some**


## Programming Languages:

### <img alt="Python" src="https://linkpicture.com/q/python_1.svg" width=20 /> Python

<pre>
<a style="color: #11daff">name</a> =<a style="color: #ba740b">"Jaipal"</a>
<a style="color: #f5e98e">print</a>(<a style="color: #0080ff">f</a><a style="color: #ba740b">"Hello, my name is </a>{<a style="color: #11daff">name</a>}")
</pre>

`Hello, my name is Jaipal`

  
### [![Bash](https://img.shields.io/badge/--000?logo=powershell&style=plastic)](https://www.gnu.org) Bash

<pre>
<a style="color: #11daff">name</a> = $<a style="color: #ba740b">"Jaipal";</a>
<a style="color: #ad319e">echo</a> <span style="color: #ba740b">"Hello World<a style="color: #f5e98e">\n</a>I am "</span><a style="color: #11daff">$name</a>;
</pre>

```bash
$ ./file_name.sh
Hello World
I am Jaipal
```


### <img alt="Java" src="https://linkpicture.com/q/java_1.svg" width=20 /> Java

<pre>
<a style="color: #0080ff">import</a> java.util.*;
<a style="color: #0080ff">public class </a><a style="color: #00ac80">main</a>() {
    <a style="color: #0080ff">public static <a/><a style="color: #00ac80">void</a> <a style="color: #f5e98e">main</a>(<a style="color: #00ac80">String</a>[] <a style="color: #11daff">args</a>) {
        <a style="color: #11daff">System.out.</a><a style="color: #f5e98e">println</a>(<span style="color: #ba740b">"Choose one option: <a style="color: #f5e98e">\n</a>1.Sphere <a style="color: #f5e98e">\n</a>2.Cube <a style="color: #f5e98e">\n</a>3.Cuboid <a style="color: #f5e98e">\n</a>4.Cylinder"</span>);
        <a style="color: #11daff">System.out.</a><a style="color: #f5e98e">print</a>(<a style="color: #ba740b">"Enter your choice(1-4): "</a>)
        <a style="color: #00ac80">Scanner </a><a style="color: #11daff">scan</a> = <a style="color: #ad319e">new <a style="color: #f5e98e">Scanner</a>(<a style="color: #ba740b">System.in</a>);
        <a style="color: #00ac80">int </a><a style="color: #11daff">number</a> = <a style="color: #11daff">scan</a>.<a style="color: #f5e98e">nextInt</a>()
        <a style="color: #ad319e">switch </a>(number) {
            <a style="color: #ad319e">case</a> 1:
                <a style="color: #11daff">System.out.</a><a style="color: #f5e98e">println</a>(<a style="color: #ba740b">"You have selected Sphere"</a>);
                <a style="color: #ad319e">break</a>;
            <a style="color: #ad319e">case</a> 2:
                <a style="color: #11daff">System.out.</a><a style="color: #f5e98e">println</a>(<a style="color: #ba740b">"You have selected Cube"</a>);
                <a style="color: #ad319e">break;
            <a style="color: #ad319e">case</a> 3:
                <a style="color: #11daff">System.out.</a><a style="color: #f5e98e">println</a>(<a style="color: #ba740b">"You have selected Cuboid"</a>);
                <a style="color: #ad319e">break;
            <a style="color: #ad319e">case</a> 4:
                <a style="color: #11daff">System.out.</a><a style="color: #f5e98e">println</a>(<a style="color: #ba740b">"You have selected Cylinder"</a>);
                <a style="color: #ad319e">break</a>;
            <a style="color: #ad319e">default</a>:
                <a style="color: #11daff">System.out.</a><a style="color: #f5e98e">println</a>(<a style="color: #ba740b">"Invalid option"</a>);
                <a style="color: #ad319e">break</a>;
        }
    }
}</pre>

```bash
$ javac main.java
$ java main
Choose one option:
1.Sphere 
2.Cube 
3.Cuboid 
4.Cylinder 
Enter your choice(1-4): 1
You have selected Sphere
```


### <img alt="C#" src="https://linkpicture.com/q/c_1.svg" width=20 /> C

<pre>
<a style="color: #ad319e">#include </a><a style="color: #ba740b"><</a><a style="color: #ba740b">stdio.h></a>
<a style="color: #0080ff">void</a> <a style="color: #f5e98e">main</a>() {
    <a style="color: #f5e98e">printf</a>(<a style="color: #ba740b">"Hello World"</a>);
    <a style="color: #ad319e">return</a> 0;
}
</pre>

`Hello World`


### <img alt="C++" src="https://linkpicture.com/q/c_44.png" width=20 /> C++

<pre>
<a style="color: #ad319e">#include</a> <a style="color: #ba740b"><</a><a style="color: #ba740b">iostream></a>
<a style="color: #ad319e">#include</a> <a style="color: #ba740b"><</a><a style="color: #ba740b">string></a>
<a style="color: #0080ff">int</a> <a style="color: #f5e98e">main</a>() {
    <a style="color: #00ac80">std</a>::string name;
    <a style="color: #00ac80">std</a>::cout << <a style="color: #ba740b">"Enter your name: "</a>;
    <a style="color: #00ac80">std</a>::cin >> name;
    <a style="color: #00ac80">std</a>::cout << <a style="color: #ba740b">"So, your name is "</a> << name << <a style="color: #00ac80">std</a>::endl;
    <a style="color: #ad319e">return</a> 0;
}
</pre>

```bash
$ g++ -o any_name file_name.cpp;
$ ./any_name
Enter your name: Jaipal 
So, Your name is Jaipal
```


### <img alt="C#" src="https://linkpicture.com/q/csharp.svg" width=20 /> C#

<pre>
<a style="color: #ad319e">using</a> <a style="color: #00ac80">System</a>;
<a style="color: #0080ff">namespace</a> <a style="color: #00ac80">Hello</a>{
    <a style="color: #0080ff">class</a> <a style="color: #00ac80">welcome</a>{
        <a style="color: #0080ff">static void</a> <a style="color: #f5e98e">Main</a>(<a style="color: #00ac80">String</a>[] <a style="color: #11daff">args</a>) {
            <a style="color: #11daff">Console</a>.<a style="color: #f5e98e">WriteLine</a>(<a style="color: #ba740b">"Hello World"</a>);
        }
    }
}
</pre>

`Hello World`


### <img alt="JavaScript" src="https://linkpicture.com/q/javascript_1.svg" width=20 /> Javascript

<pre>
<a style="color: #0080ff">let</a> <a style="color: #11daff">name</a>= <a style="color: #ba740b">"Jaipal"</a>;
<a style="color: #11daff">console</a>.<a style="color: #f5e98e">log</a>(<a style="color: #ba740b">`Hello World\nI am </a>${<a style="color: #11daff">name</a>}`);
</pre>

```bash
$ node file_name.js
Hello World
I am Jaipal
```


### <img alt="PHP" src="https://linkpicture.com/q/php.svg" width=20 /> PHP

<pre>
<a style="color: #0080ff"><</a><a style="color: #0080ff">?php</a>
<a style="color: #f5e98e">echo</a> <a style="color: #ba740b">"Hello World"</a>;
<a style="color: #0080ff">?></a>
</pre>

`Hello World`



### <img alt="Ruby" src="https://linkpicture.com/q/ruby_1.png" width=20 /> Ruby

<pre>
<a style="color: #f5e98e">puts</a> <a style="color: #ba740b">"Hello World"</a>;
</pre>

`Hello World`


### <img alt="Kotlin" src="https://linkpicture.com/q/kotlin.svg" width=20 /> Kotlin

<pre>
<a style="color: #0080ff">fun</a> <a style="color: #f5e98e">main</a>(<a style="color: #11daff">args</a>: <a style="color: #00ac80">Array<</a><a style="color: #00ac80">String></a>) {
    <a style="color: #f5e98e">println</a>(<a style="color: #ba740b">"Hello World"</a>)
}
</pre>

`Hello World`


## Non Programming Languages:

### <img alt="HTML" src="https://linkpicture.com/q/html.svg" width=20 /> HTML

<pre>
<<a>!</a><a style="color: #0080ff">DOCTYPE</a> <a style="color: #11daff">html</a>>
<<a style="color: #0080ff">html</a>>
<<a style="color: #0080ff">head></a>>
    <<a style="color: #0080ff">title</a>> Hello World <<a>/</a><a style="color: #0080ff">/title</a>>
<<a>/</a><a style="color: #0080ff">head></a>>
<<a style="color: #0080ff">body</a>>
    <<a style="color: #0080ff">p</a>> Hello World <<a></a>/<a style="color: #0080ff">p</a>>
<<a>/</a><a style="color: #0080ff">body</a>>
<<a>/</a><a style="color: #0080ff">html</a>>
</pre>

`Hello World`


### <img alt="CSS" src="https://linkpicture.com/q/css.svg" width=20 /> CSS

<pre>
<a style="color: #f5e98e">.div:hover</a>{
    <a style="color: #11daff">content</a>: <a style="color: #ba740b">"Hello World"</a>;
}
</pre>

`Hello World`

</body>