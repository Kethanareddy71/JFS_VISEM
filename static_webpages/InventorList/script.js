function showInventor() {
    const inventor = document.getElementById("inventorList").value;
    const img = document.getElementById("inventorImage");
    const info = document.getElementById("infoBox");

    const data = {
        gosling: {
            img: "images/gosling.jpg",
            info: "James Gosling is the creator of Java, developed at Sun Microsystems in 1995. He is known as the 'Father of Java'. Java became one of the most widely used programming languages in the world, powering web apps, Android apps, and enterprise systems."
        },
        rossum: {
            img: "images/rossum.jpg",
            info: "Guido van Rossum created Python in 1991. Python is now one of the most popular languages due to its simplicity and readability. Rossum worked at Google and Microsoft and is known as the 'BDFL' (Benevolent Dictator For Life) of Python."
        },
        ritchie: {
            img: "images/ritchie.jpg",
            info: "Dennis Ritchie created the C programming language in 1972 at Bell Labs. He also co-developed Unix OS. C influenced many modern languages such as C++, Java, C#, and Python. His work shaped modern computing."
        },
        stroustrup: {
            img: "images/stroustrup.jpg",
            info: "Bjarne Stroustrup developed C++ in 1979 as an extension of C. C++ added object-oriented features while maintaining speed. It is used in game engines, operating systems, browsers, and high-performance systems."
        },
        eich: {
            img: "images/eich.jpg",
            info: "Brendan Eich created JavaScript in just 10 days in 1995 while at Netscape. JavaScript became the core scripting language of the Web, powering modern websites, apps, servers, and frameworks like React and Node.js."
        },
        lerdorf: {
            img: "images/lerdorf.jpg",
            info: "Rasmus Lerdorf created PHP in 1994. PHP became the backbone of web development and powers websites like Facebook and WordPress. It is known for easy integration with HTML."
        },
        matsumoto: {
            img: "images/matsumoto.jpg",
            info: "Yukihiro Matsumoto created Ruby in 1995 with a focus on developer happiness. Ruby on Rails became famous for simplifying web development and startups adopted it quickly."
        },
        hejlsberg: {
            img: "images/hejlsberg.jpg",
            info: "Anders Hejlsberg developed C# at Microsoft in 2000. He also created Turbo Pascal and Delphi. C# became a leading language for Windows applications, Unity game development, and enterprise software."
        },
        hopper: {
            img: "images/hopper.jpg",
            info: "Grace Hopper invented COBOL and pioneered compiler development. She was a US Navy Rear Admiral and one of the earliest computer scientists. Her work influenced modern programming languages."
        },
        mccarthy: {
            img: "images/mccarthy.jpg",
            info: "John McCarthy created Lisp in 1958 and is one of the founders of Artificial Intelligence. Lisp introduced many concepts still used in programming today, such as garbage collection."
        }
    };

    if (inventor === "") {
        img.src = "";
        img.className = "circle-image";
        info.innerText = "Select an inventor to view details";
        return;
    }

    img.src = data[inventor].img;
    info.innerText = data[inventor].info;

    if (inventor === "gosling") {
        img.className = "small-square";
    } else {
        img.className = "circle-image";
    }
}
