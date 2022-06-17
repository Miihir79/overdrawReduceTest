# overdrawReduceTest
In this project I aimed to reduce the unnecessary re-drawing of certain sections of our screen, thus improving the overall performance of the app.
### What is Overdraw:
Overdraw occurs when your app draws the same pixel more than once within the same frame. read more about it <a href="https://developer.android.com/topic/performance/rendering/inspect-gpu-rendering#debug_overdraw"> here</a>. <br>
#### Here are some samples of howmuch a single line of code can effect redraws:
<table>
  <tr>    
    <td>with overdraw <img src="https://user-images.githubusercontent.com/66465511/174018613-3937334a-8f5e-4243-b175-3c50053fb2f7.jpg" width ="350">
    <td>without overdraw <img src="https://user-images.githubusercontent.com/66465511/174018622-a2d02d47-374d-4336-8672-c06a9d844edf.jpg" width="350">
  </tr>
</table>

#### What the colors mean?
* Blue: Overdrawn 1 time
* Green: Overdrawn 2 times
* Pink: Overdrawn 3 times
* Red: Overdrawn 4 or more times
* Original: No Overdraw

### Where to improve?
This single line of code written on onCreate can make the difference shown in the images.

```
window.setBackgroundDrawable(null)
```
Basically setting the background to null will make the window be opaque thus making less pixels render every time.

### How to check for overdraw?
Tap on the buildnumber for 7 times and unlock the developer options. Inside the developer options, you will find an setting named:<br> Debug GPU overdraw -> Show overdraw areas.

## Author
<a href="https://github.com/Miihir79">***Mihir Shah***</a> <br>
If you know more ways to optimize overdraw, please feel free to contribute!
