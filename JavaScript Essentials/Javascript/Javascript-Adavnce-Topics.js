
// Arrays Practing , practising more is more important than , just learning 
// now i realised its been years, i only mostly read text,and video, 
// but less practise, 70% learn , 30% practise,
// So, Now i get mantra for fast Success !
// 30% read & video learn and 70% practise with Learn ! And You archive faster than 80% of people !

let string1 = "abcdefghijklmnopqrstuvwxyz";

let array = [12, true, "Akshay", 34, 88, false];

let student = {
    name: "Akshay",
    age: 23,
    pro: "coder",
    height: 6.3,
    weight: 85
}


// This is The Javascript Topics, I have to Learn and Revise, once a month
// Beacuase , i forgot many times... resive in new js files every month, and delete it..

// Javascipt Advance Topics



// Callback Functions in JS
function call(back) {
    document.writeln("This is call function ");
    back();
}
call(() => document.writeln("This is callback function !"));



// Promises in JS
const Mypromise = new Promise((resolve, reject) => {
    let success = true;
    if (success) {
        resolve("The Task Has been completed !");
    } else {
        reject("The Task Has been Rejected ");
    }
})
Mypromise
.then(() => document.writeln("Task is Completed !"))
.catch(error => document.writeln("this is error :" , error))
.finally("the promise finally solved ")



// Api Fetching with Async await 

async function fetching() {
    try {
        const url = "https://dummyjson.com/posts";
        let fetching = await fetch(url);
        let res = await fetching.json();

        // Option 1: Loop through the posts array
        res.posts.forEach(post => {
            document.writeln(`<li>${post.title}</li>`); // Changed from x.posts to post.title
            document.writeln("<br>");
        });

        // Option 2: Display formatted JSON
        // document.writeln(`<pre>${JSON.stringify(res, null, 2)}</pre>`);
    } catch (error) {
        document.writeln(error); // Fixed typo: was writeln9
    }
}

fetching();




// Closure in JS
function test() {
    let count = 0;
    function inner() {
        count++;
        return count;
    }
    return inner;
}
let counter = test();
document.writeln(counter());
document.writeln(counter());
document.writeln(counter());
document.writeln(counter());
document.writeln(counter());

