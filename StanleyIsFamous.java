package misc;

/**
 * Stanley is Famous
 * @author Colm Roach
 * Choose Your Own Adventure game
 * Features:
 *  - 13 Endings + 1 True Ending
 *  - 23 story methods
 *  - Probably semi-functional Blackjack
 */
import java.util.Scanner;
import java.util.Random;
public class StanleyIsFamous {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    //Ending variables + ghost boolean
    static boolean ghostToken = false;
    static boolean wipedFromExistence = false;
    static boolean diedTwice = false;
    static boolean bullyNeighbor = false;
    static boolean cosmicApex = false;
    static boolean epicRobotFight = false;
    static boolean brothersAfterAll = false;
    static boolean caughtMeissner = false;
    static boolean successfulInterview1 = false;
    static boolean successfulInterview2 = false;
    static boolean successfulInterview3 = false;
    static boolean successfulInterview4 = false;
    static boolean unsuccessfulInterview4 = false;
    static boolean successfulInterview5 = false;
    public static void main(String[]args){
        initialize();
    }
    
    //Required methods
    
    public static void initialize(){
        System.out.println("Stanley is Famous.\nStanley hosts the highest rated, and by far the most popular podcast to ever grace the earth.\nIn fact, most talk shows, YouTube channels, Twitter accounts, internet blogs, high school courses, newspaper articles, \nand even other podcasts, are entirely devoted to talking about the events of Stanley's podcast episodes.");
        System.out.println("Despite this, Stanley is significantly less famous than his older brother Kyle, host of the talk show \"Stay Up Late With Kyle\"\nKyle has always been the superior brother. He's much smarter, much harder, much better, much faster,\nmuch stronger, much richer, and much, much more famous than Stanley ever will be.\nRecently, Kyle's successful interview with philanthropist Rachel May has caused his ratings to skyrocket, much to Stanley's dismay.");
        System.out.println("It is your job to find a way to one up Kyle, and prove yourself superior.\nBecause in this story you are Stanley, and Stanley is you.\n(essentially you're supposed to type in 1 or 2 to make choices, it's simple mostly I think)");
        start();
    }
    
    public static boolean getChoice(String option1, String option2){
        System.out.println("\n1. "+option1);
        System.out.println("2. "+option2+"\n");
        while (true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){return true;}
            else if (choice == 2){return false;}
            else{System.out.println("Please enter a valid input");}} 
    }

    public static boolean playAgain(){
        System.out.println("\nDo you wish to start again?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Make your choice now: ");
        int playAgainChoice = scan.nextInt();
        if (playAgainChoice == 1){return true;}
        else{return false;}
    }
    
    //Start
    
    public static void start(){
        ghostToken = false;
        String option1 = "Get up, and start the day";
        String option2 = "Go back to bed and leave it a little longer";
        System.out.println("\n\nYou wake up at precisely 6:49 in the morning, with two days left until your next podcast episode is to be recorded.\nThis is big, under no circumstances can you mess this up. You need to make your next choices wisely.");
        if (getChoice(option1,option2)){getUp();}
        else{backToBed();}
    }
    
    //Actually working
    
    public static void getUp(){
        System.out.println("\nTo start, you decide to check your email.\nAs per usual, there are tens of millions of unread messages from just about every famous person you could ever imagine, dying to be interviewed");
        System.out.println("Taylor Swift, Elon Musk, Corson Bray, Tom Brady, Dwayne Johnson, Bill Cosby, Christopher Lee, Sam Sulek,\nJimmy Donaldson, Dave Grohl, The remaining members of the Beatles, Scarlet Johanssen, Sigmund Freud, Maya Hawke, Tom Hanks,\nMargot Robbie, Kanye West, Neil Cicierega, Jeremy Elbertson, Thom Yorke, Ariana Grande, Abel Tesfaye, Justin Trudeau,\nChristopher Nolan, Joe Rogan, Vladimir Putin, Martin Scorsese, Alan Rickman, even your absent father are some of the names that stand out.");
        System.out.println("\nEventually though, you settle on five potential candidates:");
        System.out.println("\nHerbert Meissner, a notorious German serial killer responsible for well over a hundred direct homicides. Known for his horrifyingly\nbrutal torture methods, impressive manipulation skills, and nihilistic worldview. Any member of law enforcement who had attempted\nto find him had their lives ruined in one way or another, having read many of their unfathomably, soul-crushingly depressing stories,\nyou know incredibly well how dangerous this man is. Scary dude.");
        System.out.println("\nIbrahim Moizoos, a former university football player who had recently won the 58th Super Bowl after it was decided that he was just\nbetter than the Chiefs, and that he was more deserving of it anyways.");
        System.out.println("\nBenedict Wombleton, a playwright who has just finished overseeing the opening weekend of his most recent play \"Echoes of\nElysium: A Reverie in Seven Movements\". A genre-busting epic featuring some of the most pretentious dialogue and agonizingly slow pacing imaginable.");
        System.out.println("\nVilen Borshevik, an infamous Russian revolutionary who rose to prominence around the dawn of the 20th century. Said to have\nassassinated at least 6 dozen people and had been a key player in a destructive war in Afghanistan.");
        System.out.println("\nLilja Heimisson, an Icelandic experimental pop star who has recently attained high levels of popularity both in underground\ncommunities and in the mainstream after the recent release of her debut album and announcement of her European tour.");
        System.out.println("\nObviously, you get to decide on who to interview");
        System.out.println("\n1. Herbert Meissner");
        System.out.println("2. Ibrahim Moizoos");
        System.out.println("3. Benedict Wombleton");
        System.out.println("4. Vilen Borshevik");
        System.out.println("5. Lilja Heimisson\n");
        while (true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){herbertMeissner();
            break;}
            else if (choice == 2){ibrahimMoizoos();
            break;}
            else if (choice == 3){benedictWombleton();
            break;}
            else if (choice == 4){vilenBorshevik();
            break;}
            else if (choice == 5){liljaHeimission();
            break;}
            else{System.out.println("Please enter a valid input");}}
    }
    
    //Stanley becomes a ghost
    
    public static void backToBed(){
        String option1 = "Actually buckle down to work";
        String option2 = "Go use your ghostly powers to have a little fun";
        System.out.println("\nYou lay in bed and slowly rot away, after said rotting is done you are nothing but a skeleton.\nYour ghost gazes upon your rotted corpse and thinks \"Hey, that was actually really cool\".\nYou then immediately snap out of your bewilderment and realize you still have a podcast to host.\nBeing dead obviously doesn't relieve you of your responsibilities.");
        if (getChoice(option1,option2)){ghostToken = true;
                getUp();}
        else{goGhost();}
    }
    
    public static void goGhost(){
        String option1 = "Fly into The White House and expose government secrets";
        String option2 = "Scare the hell out of people";
        System.out.println("\nYou float out of your cheap, dingy apartment through the wall and gaze upon the city, lit by a gorgeous sunrise.\nYou're ready to have some fun.");
        if (getChoice(option1,option2)){whiteHouse();}
        else{scarePeople();}
    }
    
    //Start of White House infiltration
    
    public static void whiteHouse(){
        String option1 = "Stand your ground";
        String option2 = "Absolutely run for your life";
        System.out.println("\nYou float over to The White House and decide to go inside.\nSince you're a ghost, no one can see you and you're free to do as you please.\nHowever, your attention is almost immediately taken up by the President himself nervously speed walking past you, to his office.\nYou take notice of his demeanor, and opt to follow him.");
        System.out.println("\nYou float through his office doors and find him talking with a man wearing a mask with what looks like a fedora atop it.\nThe mask is entirely black, molded to the shape of an incredibly upset looking face.\nThe man is otherwise well-dressed, with an expensive looking black suit alongside the mask.\nThe only splash of light in his attire is a white tie.\n\"Pleasure to meet with you again, Mr. President.\" the man says.\nHe's rather well spoken, with an incredibly professional demeanor.\n\"What do you want, man? I've done everything you've asked for and you still won't leave our country be?\" The President replies");
        System.out.println("\"I'm aware you're new, but you're taking far too much time to truly understand which one of us is in charge here.\" The masked man states in a threatening, imposing tone.\nHe is definitely the one in charge here.\n\"I don't think you really get what it means to be in charge of a country\"\n\"What I \"don't really get\" is your utter incompetence. Your absolute failure to even take my recommendations into consideration.\"");
        System.out.println("\"Your decisions are killing people man. We can't keep prolonging wars and funding genocide.\n\"My decisions have been reasons far beyond your feeble understanding. What I will-\"\nThe masked man stops. He's staring directly at you. He doesn't see you right?\n\"Is there a problem?\" The President asks.\n\"We have a guest.\" The masked man replies.\nYour heart stops. The man stands up.\n\"Don't you have a podcast episode to prepare for Stanley?\"");
        System.out.println("You aren't that surprised he knows your name, you are incredibly famous after all.\n\"Stanley the podcast host is here? NOW?\" The President excitedly asks.\n\"Yes, and I'm sure he'll wish he wasn't soon enough.\"\nDead or not, this is a threat you should absolutely be taking seriously.");
        if (getChoice(option1,option2)){standGround();}
        else{runAway();}
    }
    
    public static void standGround(){
        System.out.println("\n\"Don't you know who I am?\" You ask the masked man.\n\"Yes... I've addressed you by your name, Stanley.\" The man replies\n\"Then you should understand my true power.\" You say as you begin to empower yourself.\nBlue fire begins emanating from your ghostly body. You are absolutely ready to whoop some ass.\n\"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHH\" You scream as you feel the power of a trillion neutron stars flowing through your body.\nThe man snaps his fingers.\nThen the feeling stops, your power is gone.\n\"What did you do to me?\" You ask, in an incredibly badass voice.\n\"You may already be dead, Stanley, but you aren't gone yet.\" The man begins walking towards your weakened ghost.\n\"Don't worry, I'm sure many will mourn you greatly\"");
        System.out.println("He places his hand on your shoulder, and you begin to cease.\nIt's agonizing. A pain far worse than any could ever imagine. A pain that, even if only felt for a second, would be a fate far worse than death.\n\"By coming here today Stanley, you've decided to jump headlong into an unending dark void ready to swallow you whole.\"\nYou feel empty, as everything is stripped away from you.\nYou try to flash through your life before all the memories fade.\nYou remember the homegrown rhubarb your aunt used to bake into tarts. You always helped. You loved being her little assistant baker.\nYou remember all the fun you used to have with your friends as a kid. The bridge you all loved to play games on together, even with your brother.\nYou remember the time you went back with him when you were teenagers. As you reminisce about those days, you realize he loved them just as much as you did.\nHe really cared about you, and he was so happy for you when you started to get somewhere. He supported you every step of the way.");
        System.out.println("But that didn't matter to you, all you cared about was one-upping him. Making yourself look better.\nGod you wish you didn't.\nYou start to fade, finally.\nBut all you feel is regret and self-hatred.\nThe man was right, you really wish you weren't here right now.\nYou flashback to when you were home, when you were really happy.\nBy the time you were gone, those were the last memories with you.");
        System.out.println("\nThe End: Wiped from Existence");
        wipedFromExistence = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    public static void runAway() {
        System.out.println("\nYou decide a fight isn't worth your time, so you absolutely book it.\n\"Book it\" in this case, means you are flying away at impressively high speeds, going through any object in your path.\nYou approach the doors, thinking you've nearly gotten away.\nUntil something flashes by you at unimaginable speeds and stops you in your path.\nIt hurts, like, a lot.\nYou see the masked man again, this time directly in front of you with his hand embedded in your chest.\nHe stopped you, he physically stopped you, and you are a ghost.\nHis hand being inside you is of note too, because he shattered your ribcage, and punctured a lung.\nNo wonder it hurts so much.");
        System.out.println("\"You really made a mistake coming here today, Stanley.\" The masked man coldly states.\nYou fall to the floor, holding your noncorporeal chest in agonizing pain.\n\"H-h how...?\" You ask, coughing up blood.\nMind you, all of this is incredibly concerning as you are already dead, but this man is still killing you.\n\"It's simple, Stanley.\" The man says as he cleans off his bloodstained glove.\n\"You have had the opportunity to witness a mere fraction of my power. I hope you know to stay away from me once we reset.\"\n\"Reset?\" You ask, confused, and in agony.\n\"I'm sure you'll have plenty of time to figure it out Stanley. Don't fret.\" He replies, in an almost reassuring tone.\n\"But until then, You have much to learn.\"\nThe man places his hand on your shoulder, and wipes the little of your ghost that remains, from existence.");
        System.out.println("\nThe End: Dead Twice");
        diedTwice = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    //Start of scaring people
    
    public static void scarePeople() {
        String option1 = "Your incredibly annoying next door neighbor";
        String option2 = "The sweet old lady directly below you";
        System.out.println("\nYou're ready to use some of your ghostly abilities to scare the hell out of people.\nBut first you need to pick a target.");
        if (getChoice(option1,option2)){scareNeighbor();}
        else{scareGrandma();}
    }
    
    public static void scareNeighbor() {
        System.out.println("\nYou hate your neighbor.\nHe's incredibly belligerent, usually responding to any attempts at socialization with massive hostility.\nTo be honest, it's easy to see why no one really likes him.\nAnyways, you float into his apartment, absolutely invigorated by the idea of giving this man a bad day.\nYou see him sitting on an armchair, watching reruns of The Big Bang Theory.\nYou decide to slam a door shut to startle him. Some classic ghost activities.\nHe reacts, but only slightly.\nA little disappointed, you decide to drop a framed photograph off of his wall, hoping for better results.\nHe gets up, muttering obscenities, before walking over to check the damage.\nIt was a photo of an apple on a chair, in black and white, with some very peculiar lighting.\nLooks like an art piece on further inspection.\nHe goes off to get a broom to clean up some of the broken glass.\nIn the meantime, you decide to start causing some REAL chaos.");
        System.out.println("\nYou start throwing everything you can across the room.\nShattering plates, bursting light bulbs, creating translucent orbs that make people sneeze. Y'know, ghost stuff.\nYou look back at your neighbor, and realize he looks sad.\nNot scared, not angry, just an expression of \"I really can't do this. Not right now.\"\nUntil you hit a picture you probably shouldn't have.\nThe framed picture falls on the ground and shatters.\nNow he's scared, he runs over, clearly incredibly concerned for the state of the photograph.\n\"No... nonononono please no.\" He says, clearly panicked.\nThe frame is annihilated, and there's significant damage to the photo itself.\nHis hands are shaking, he doesn't want to believe what he sees.\nHe curls into a ball, and then starts sobbing.\nYou look at what remains of the photo.\nIt looks like him, but cleaner, more kempt, and he's standing next to a beautiful woman.\nHe has a young girl held in his arms, clinging to him tightly.\nYou realize you've never seen these people before, and then it hits you.\nYou feel awful.");
        System.out.println("You look around his apartment again, at the mess you've caused.\nAll the food he owns is absolute garbage. It's all easy to make, but none of it is even remotely good for you.\nMost are uneaten too. You know he rarely goes out and that the last time he did was about a month and a half ago.\nBut he's only eaten about a week's worth of food.\nYou glance over at his unmade mess of a bed, and take note of the small journal he keeps next to it.\nYou glance back at him, his clothes are filthy.\nYou remember that he's unemployed, and that he likely hasn't done anything at all since he last left for groceries.\nHe's still crying. You float over to his little journal and flip through.\nIt's all about death. Lots of experiences with hauntings too, it's clear now why he wasn't too phased at first.\nAnything else he writes down is incredibly mundane, you can tell he lives a really sad life.\nYou don't feel too good about yourself right now, so you opt to make things maybe a little better.\nYou write him a nice message. Reminding him of how important he is, how different so many people's lives would be without him.\nYou sincerely apologize too, and let him know that you'll try to make things better in the future.\nBefore you leave, you make sure to let him know that his neighbor Stanley would love to have him over some time.\nYou float back to your apartment, unsure of how to feel.\nBut you think to yourself about how you've probably learned something about empathy, and passionately hating people you barely know is probably something you should stop doing.");
        System.out.println("\nThe End: You Bullied a Guy");
        bullyNeighbor = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    public static void scareGrandma() {
        System.out.println("\nGrandma Miranda, a Spanish woman, lives in the apartment directly below you, incredibly nice.\nRegardless, you're still going to try and scare her for whatever reason.\nHowever it seems you might be a little late for that, as she's just on her way out of the apartment.\nYou consider your options.");
        System.out.println("\n1. Follow her");
        System.out.println("2. Go for your neighbor instead");
        System.out.println("3. Actually go and do work\n");
        while (true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){followGrandma();
            break;}
            else if (choice == 2){scareNeighbor();
            break;}
            else if (choice == 3){getUp();
            break;}
            else{System.out.println("Please enter a valid input");}}
    }
    
    //Grandma summons an eldritch horror
    
    public static void followGrandma() {
        String option1 = "Go back to a past life, one you swore you'd leave behind";
        String option2 = "Go and find help";
        System.out.println("\nGrandma Miranda is an unimaginably slow walker. So while you follow her your mind trails off to a couple places.\nYou think about the Thai food you ordered last night and how good it was.\nIt was shrimp stir fry, because you've always been a pretty big fan of seafood.\nYou ate it with your producer. A man who's rather well spoken, with an incredibly professional demeanor.\nHe produces your brother's talk show too, so he has a pretty big influence on pop-culture and the world at large.\nIt's honestly a little concerning that one man controls the two most famous people to ever exist.\n\"No one man should have all that power.\" you think to yourself. Luckily, you trust him, and know he'd never do anything wrong.\nHe makes a lot of money too, money you'd probably spend trying to build a giant robot.\nYou've always wanted to pilot a giant robot.");
        System.out.println("\nOh! You're here!\nWhere exactly is here?\nYou appear to be in the middle of the desert.\nGrandma Miranda starts stomping on the ground next to a rock.\nA hatch opens under her foot.\n\"Now this is getting interesting!\" you think to yourself.\nShe starts to climb down a comically long ladder. This is going to take a bit.\nAnyways, what were you thinking about before?\nOh yeah, giant robots. Wouldn't it be awesome to fight some big-ass kaiju monster in a giant robot?\nAside from that massive property damage that you'd likely be held accountable for it would probably be the experience of a lifetime.\nYou then realize you've reached the bottom of the ladder. The area looks like an abandoned government compound.\nIt's eerily similar to those old \"Area 51\" games you'd see copied and pasted everywhere across Roblox in 2015.\nMiranda continues to walk through the empty metallic halls.\nShe walks, and walks, and walks, and walks, and continues to walk a little more, and eventually opens a door locked by a keypad.\nInside the room is plenty of occult imagery, animal skulls, and an enormous red circle in the center.\nMiranda walks up to an altar, and speaks.");
        System.out.println("\"Ea'kthulu, yug'karnath, glosh'gath!\nA'zarnax, veth'saloth, e'enorath!\nKul'golnath, cthar'vath, vrith'gol!\nAzoth'keth, krul'neth, neth'karn!\nZel'naroth, e'tharnoth, sorn'karn!\nGnash'goloth, vark'neth, vrith'karn!\nVo'zarnath, gleth'goloth, sorn'karn!\nZel'naroth, e'tharnoth, sorn'karn!\nBryn'karnath, glosh'gath, voth'nar!\nEnacta neth'karnath, krul'gath, sorn'karn!\" she says, speaking in an old language known as the \"Gheldeshi Tongue\"");
        System.out.println("Luckily, you're fluent in all known Gheldeshi languages, and know exactly what she's saying.\nThe rough translation is something like: \"I summon thee! Glosh'gath, the \nWrithing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, \nSpawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm! \nTo enact your endless judgment upon the world!\"");
        System.out.println("Not good.\nShe keeps repeating the phrase as her eyes roll to the back of her head and unbearably strong gusts of wind begin to sweep through the room.\nThe red circle turns into what can only be described as a portal to the darkest pit of hell, the deepest recesses of the omniverse.\nOut of the portal appears a giant four-dimensional tentacle shaped object.\nAs more of whatever the object is comes out of the portal, you slowly realize that this must be him, Glosh'gath, \nthe Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, \nHarbinger of Cosmic Entropy, and Bringer of the Final Cataclysm.\nIt looks like the sweet old lady from downstairs has been plotting the end of the world as we know it.");
        System.out.println("The sheer presence of the creature can only be described as \"overwhelming\", you can barely think while it's near you.\nMiranda however, is completely unaffected.\nIt looks like she's commanding the beast, beckoning him to cleanse the rest of the world of life, to devour all that is left.\nBut you can't focus on what's being said, no matter how hard you try the sheer power of Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, \nHerald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and \nBringer of the Final Cataclysm keeps drowning out all of your thoughts.\nYou awaken, completely dazed.\nThe bunker you were in is completely destroyed, and both Miranda and Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, \nHerald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, \nand Bringer of the Final Cataclysm are nowhere to be found.\nYou consider your options.");
        if (getChoice(option1,option2)){goCosmic();}
        else{findHelp();}
    }
    
    public static void goCosmic() {
        System.out.println("\nAs much as you hate to do this, you need to become The Cosmic Apex once again.\nYour life as an interstellar superhero was something you had long abandoned, after an endless string of traumatic events.\nThe trillion year war between the forces of the Void Locus and The Gieguen Empire had left a scar on you, one that wouldn’t heal.\nBut you can't let those awful memories stop you now. You are The Cosmic Apex.\nA being of pure power born during the cataclysmic collision of two parallel universes. \nWho exists in every possible universe, in every possible form, in every possible state, controlling every possible story.\nYou had long repressed these powers, but now they must return, the rest of the world needs you.\nYou close your eyes, and say a solemn goodbye to the humanity you've obtained, before you ascend into pure omnipotence.\nThe full power of The Cosmic Apex has awakened.\nYou proceed to wipe Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm from existence, saving the world from its wrath.\nYou've defeated an unstoppable foe, but at what cost?\nYour humanity has been sacrificed in order to become powerful enough to stop the creature.\nNow all you are is pure power.");
        System.out.println("\nThe End: Stanley Solos No Diff");
        cosmicApex = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    public static void findHelp() {
        String option1 = "Go to the government";
        String option2 = "Call Kyle";
        System.out.println("\nYou think about who you could call for help.\nYou consider the government, but admittedly they usually aren't useful in situations like this.\nHowever, the only other option you can think of is calling for your older brother, Kyle.\nWhich of course, you are incredibly reluctant to do.");
        if (getChoice(option1,option2)){callGovernment();}
        else{callKyle();}
    }
    
    public static void callGovernment() {
        System.out.println("\nYou opt to go talk to national security.\nYou float over as a ghost before realizing that the entirety of Washington, D.C. is gone.\nIt's just disappeared, there is quite literally a void of nothingness where it once stood.\nA little freaked out, you decide to look elsewhere.\nThe rest of the world is in utter chaos.\nEverything is either a wasteland or outright doesn't exist. You lose hope the more you look, there is absolutely nothing you can do to help.\nYou then spot a man wearing what appears to be a mask, and a black suit, kneeling, hands inside of some mechanical capsule. You approach him.\nHe immediately greets you, despite you being a ghost.\n\"Hello Stanley, glad to see you're alright.\" He says in a well-mannered voice.\n\"Hold on, how can you see me? I'm a ghost.\" You ask the man.\n\"I have a higher level of cosmic awareness than most, higher than yours I'd assume. Though I'm not quite sure, you often impress me, Stanley.\"\n\"What'cha got there?\" You question.\n\"A last resort\" He responds.\n\"But...\" He stands up. \"...I think you may have a decent shot against this thing.\"\n\"You mean Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm?\"\n\"Yes\"\n\"Alright, so what's your plan?\"\n\"Have you ever wanted to pilot a giant robot?\"");
        System.out.println("Your eyes widen in excitement.\nYou have never been more ready to do something in your life.\n\"Because you're going to need to fight with one\"\n\"Yes, absolutely, I'm ready to do this now, let's go.\"\n\"Lovely.\" The man says whilst straightening his tie. \"ARISE!\" He shouts.\nFrom the ground a massive robot appears. Decked out with weaponry, and ready for the taking.\n\"I need to thank you sir.\" You say to the man. \"Because if I don't come back, I need you to know that you've made my dreams come true.\"\n\"Oh don't worry Stanley, I'm sure we'll meet again.\" He says, though you aren't paying attention as you're already off to jump into his robot.\nYou fly off to space, ready to find Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm and absolutely annihilate him.\n\"GLOSH'GATH, THE WRITHING ABYSSAL DEVOURER OF AETHERIC REALMS, HERALD OF THE EVERLASTING ECLIPSE, SPAWN OF THE UNFATHOMABLE VOID, HARBINGER OF COSMIC ENTROPY, AND BRINGER OF THE FINAL CATACLYSM, I HAVE COME TO DESTROY YOU ONCE AND FOR ALL!\"\nYou scream it with so much passion you could bring a dead person back to life.\nYou are absolutely ready to die doing this.\nGlosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm appears in front of you, accepting your challenge.\nYou begin to fight. It is the single greatest battle ever fought by any two living beings.\nIt is so far beyond incredible that it's genuinely indescribable. It's just so amazing that even I, the narrator, am completely speechless.\nIt is the coolest thing you have ever experienced.\nSlowly but surely though, you begin to lose the upper hand.\nThe robot is beginning to take critical damage.\nIt's missing two of its limbs, weapons are severely damaged, and oxygen systems are going offline.\nYou're going to die. But you're ready to die.\nYou initiate the \"Event Horizon Protocol\" which allows the robot to explode into a supermassive black hole.\nYou look into the eyes of Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm, as he looks into yours.\nHe can tell that he's lost, and gives an honorable nod as he accepts his fate.\nThat fight was the best thing both of you have ever been a part of.\nAs the Event Horizon Protocol activates, you close your eyes and accept your fate.");
        System.out.println("\nThe End: Epic Robot Fight");
        epicRobotFight = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    public static void callKyle() {
        System.out.println("\nYou begrudgingly pull out your phone and dial Kyle's number.\nHe picks up immediately.\n\"Hello Stanley!\" He says, in his characteristically theatrical voice.\n\"Yeah, hi. I -uh... I kinda got something going on right now, you think you could help me out with it?\"\nEvery syllable hurts for you to say. The fact that you need to rely on your brother for help is a massive blow to your ego.\n\"You mean the giant world devouring demon I just saw fly into space?\" Kyle asks.\n\"Yeah.\"\n\"I have no idea why on earth you'd ever summon Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm but I won't question.\"\n\"Oh no I didn't summon him.\"\n\"Who did?\"\n\"My downstairs neighbor.\"\n\"The old woman?\"\n\"Yeah, how did y-\"\nI'll get over there and help, don't worry.\" Kyle cuts you off and hangs up before you can finish your sentence.\nYou wait patiently for about 20 seconds before Kyle taps you on the shoulder.");
        System.out.println("\"How's it hanging lil' bro?\" He immediately asks.\n\"Do not call me that.\"\n\"It's been a while since we've spent any time together. Why don't we catch up a little first?\"\n\"We have an eldritch horror beyond human understanding, out and about killing everything it can.\"\n\"Oh that'll be fine, we can deal with him easily.\"\nYou continue to bicker back and forth, you're adamant on not making this a bonding experience, and just want to use your brother's help.\nKyle however, desperately wants to know everything he possibly can about your life.\nLike, he REALLY wants to catch up.\nAfter awakening your inner English student, you manage to convince him that the space demon is a more important issue.\nIt took you about 44 minutes of trying to convince Kyle to get him to agree.\nEither way, you've both unleashed you inner cosmic powers, and are on your way to destroy Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm once and for all.\nYou arrive, face to face with the beast. With Miranda standing by, commanding his every move.");
        System.out.println("\"DO YOU PITIFUL HUMANS REALLY THINK YOU CAN STOP ME!\" Miranda exclaims in a shockingly deep voice.\nIt sounds almost exactly like Kevin Michael Richardson.\n\"Of course we can! The likes of you are no match for our brotherly bond!\" Kyle says while giving you a slug on the shoulder.\nYou can tell he's definitely picking on you for fun this time.\nYou honestly kind of missed it. But now that really isn't your biggest concern.\n\"IMPOTENT FOOLS! GAZE UPON THE BEAST I'VE ENSLAVED! YOU STAND NO CHANCE!\" Miranda violently yells.\nThat being said, you and Kyle are more than ready to prove this woman wrong.\nThe battle begins as you start hurling cosmic fire towards Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm.\nThe damage is very noticeable, the marks left are similar to fourth degree burns on a human.\nKyle begins attacking with the \"Shredder of Dimensions\" , an enormous, obscenely powerful claymore that he just generated out of thin air.\nOnce again one-upping you.\nThat being said, it's evident that you are both making quick work of this thing.\nUntil Miranda starts blasting away at you with a pistol. The bullets obviously bounce off of you but they distract you long enough for Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm to punch you through space and time.\nYour body shatters, and you start flying through everything at every time until you land in about 729 CE, Earth-21521144.");
        System.out.println("That must hurt.\nYou struggle to pick yourself back up, having taken heavy damage, but you push yourself and eventually manage to stand up.\nIt takes some time, and a lot of effort, but you manage to find your way back to your home dimension, at the proper time.\nYou see Kyle, standing over the slain body of Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm, completely unharmed.\nHe has Miranda in completely normal handcuffs, and has a massive smile on his face.\nYou have never felt more useless in your life.\n\"Hey Stanley! I fixed the problem!\" He exclaims.\n\"YES, HE FIXED THE PROBLEM. NOT YOU STANLEY.\" Miranda says to you with a chuckle. Trying her best to anger you.\nYou and Kyle travel back to Earth, and hand Miranda over to the police.\n\"AND I WOULD'VE GOTTEN AWAY WITH IT TO IF IT WEREN'T FOR YOU MEDDLING KIDS!\" She yells as she's hauled off to prison.\nAlthough you think Miranda's comment was pretty funny, you can't shake the feeling of shame.\nYou really didn't do anything, Kyle did all of the work and you just layed in the middle ages with broken bones that have since healed.");
        System.out.println("\"All in a day's work.\" Kyle says, proudly.\nYou look at him. You try to display anger on your face but you can't. All you feel is sadness.\n\"Anything wrong, Stanley?\" Kyle asks.\n\"You have no idea how much better you are than me, do you?\" You angrily ask Kyle.\nHe looks puzzled. As if he'd genuinely never seen himself as such.\n\"Every single thing you do, you do better than me. ...and it feels awful.\" You continue.\n\"Because of you I've never felt proud of myself. I'm a budget version of you, and the only reason I matter is because I'm your brother.\"\n\"I've... I didn't know you felt like that.\" Kyle says, sounding truly heartbroken.\n\"I'm really proud of you Stanley. I've always felt like we've been a really great pair.\"\n\"And...\" He continues. \"...I'm glad I got to do this with you. Even if you spent most of the battle in another dimension.\"\nYou really appreciate what he's saying, but you still can't shake that feeling of inferiority.\n\"Anyways, I guess you'll be glad to know that I'm quitting my job.\" Kyle says, genuinely surprising you.\n\"What? Why?\" You ask, honestly feeling a little sad.\n\"I'm going off the grid, and I think I'm going to marry Rachel.\"\nYou think back to Kyle's most recent interview with the famed philanthropist Rachel May.\nIt consisted of him asking her questions, before proceeding to baselessly accuse her of being a criminal.\nAn assumption he was correct in, prompting her to draw a blunt weapon and attempt to kill Kyle.\nKyle responded by drawing a sword, and dueling her.\nAfter a long, very impressive fight between the two, they both passionately confessed their love for one another, before performing a big damn kiss, on air.\nAfter the episode aired, crime rates dropped significantly as Rachel disappeared from the country entirely.\nThe episode was critically acclaimed, sitting at a 44.7/10.0 rating on IMDB, even having crashed the site several times.\nEven you had to admit that it was an impressive performance.");
        System.out.println("\"So, you're planning to marry the woman who tried to kill you?\" You ask Kyle.\nHe proceeds to go on as to why, before bringing up your first high school girlfriend, and how she tried to do the same.\nThis leads to you bringing up his embarrassingly huge crush on Megan Fox when he was younger.\nSoon, you're both talking like you were when you were younger.\nYou feel happy. For yourself, and for Kyle.\nYou think about the life you live, and think about what you really want to do with it.\nYou both walk home together, and realize this is definitely one of the better ways this whole situation could've ended.");
        System.out.println("\nThe End: Brothers After All");
        brothersAfterAll = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    //End of scaring people
    
    
    //Start of interviews
    
    //Herbert Meissner
    public static void herbertMeissner() {
        System.out.println("\nYou decide to interview German serial killer Herbert Meissner.\nObviously you don't need to prepare any notes because you're a great improviser and can just think of questions on the spot.\nSo you pass out on the couch and sleep for two days.");
        if(ghostToken){System.out.println("Before you arrive at the studio, you cease being a ghost, like normal.");}
        System.out.println("As you arrive, you are immediately greeted by your producer.\nHe always holds a professional demeanor, a very well spoken gentleman as well.\nHe does production work for both you and your brother Kyle, making him incredibly powerful in the media industry.\n\"Good morning, Stanley.\" He says to you.\nYou respond by:");
        System.out.println("\n1. Politely greeting him");
        System.out.println("2. Giving him a rib-crushing hug\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"Good morning to you too Mister Producer Sir!\" You say before you sit down, ready to record");;
            break;}
            else if (choice == 2){System.out.println("\nYou wrap your arms around your producer, and hug him incredibly tight.\n\"Uh... yes Stanley, thank you.\" He says uncomfortably as you embrace him\nThe hug lasts for about nine minutes before you let him go");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("\"I'm ready\" You say, prompting Mr. Meissner to enter the room");
        System.out.println("Mr. Meissner sits down in the chair across from you.\nHe's got long blonde hair with light blue eyes, very stereotypically German\n\"Hello Stanley, It is my pleasure to be with you today.\" Herbert says to you, in a cold dead tone, masking any kind of a German accent.\nYou gaze into his eyes, and see absolutely no soul behind them.\nIn front of you is a man of no remorse, no morals, and pure evil.\nYou exchange greetings, and then ask your first question:");
        System.out.println("\n1. \"So, why'd you start killing people?\"");
        System.out.println("2. \"What do you consider to be the most enjoyable part of murdering innocents?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"When I was a young boy, I found myself with dead parents, and nowhere left to go.\" He states, not a hint of sadness in his voice.\n\"Both murdered by hitmen, sent out by high ranking members of an organized crime syndicate. One I've since destroyed from the inside.\"\nHe laughs, very proud of himself.\n\"Regardless, the lack of parents means I was sent to an orphanage, or at least that's what it looked like from the outside.\"\nHe begins to display actual sadness as he speaks, whatever this place was, it messed him up.\n\"The orphanage was a front for a government project to summon some ancient eldritch deity. Run by some older woman, we called her the wicked witch.\"\n\"It was an awful place...\" He's genuinely upset. This may have been too strong of a question to open with.\n\"...But I made it out, and learned just how awful people can be to those below them.\"\nHe regains some of his composure.\n\"Because of that experience, I realized that the only thing human beings are equal in, is death. I sought to prove that to people.\"\nYou think that's a pretty lame excuse for being a serial killer, but you can't help but feel bad for him, this place clearly destroyed him.");;
            break;}
            else if (choice == 2){System.out.println("\n\"Most definitely the psychological aspect of their suffering.\" He says with a cold smile.\n\"Watching every little bit of hope leave them as they realize that they're going to die is so fun to watch.\"\nHe proceeds to go on about the different ways people had reacted as he killed them, reliving every moment in utter ecstasy.\nYou begin to realize that this guy is really edgy.");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("\"Right, thank you Mr. Meissner, on to the next question.\"");
        System.out.println("\n1. \"Have you ever eaten chalk?\"");
        System.out.println("2. \"What do you believe the meaning of life is?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"I can't say I have.\" Herbert replies.\n\"They actually aren't half bad, good sources of calcium too.\" You say back to him.\n\"Is chalk even edible?\"\n\"Yeah, just don't eat too much at once.\"\n\"Alright\"");;
            break;}
            else if (choice == 2){System.out.println("\n\"I firmly believe that all life is a fate worse than death. I don't truly believe that I'm an evil person, if anything I'm doing a favour.\" Herbert claims.\n\"Right, yeah, makes sense.\" You reply, beginning to notice how legitimately deranged this man is.\n\"Why exactly do you decide to torture your victims to death then?\"\n\"Makes it more enjoyable.\"\n\"Ooooookaaay...\"");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("You start thinking of what to ask next.");
        System.out.println("\n1. \"If you were suddenly transformed into a sentient rubber duck for 24 hours, complete with the ability to communicate with other rubber ducks, what would be your first order of business in the aquatic world?\"");
        System.out.println("2. \"What do you usually eat for breakfast?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"Hmm... I think I'd find a common enemy to unite all rubber ducks against. Nothing unites people like a common enemy, and once united, we could be unstoppable.\"\n\"Honestly, that's a fair enough answer. What would you do while commanding this unstoppable duck army?\"\n\"Cause as much chaos as possible.\"\nYou actually find yourself agreeing with Herbert for the most part, strangely enough.");;
            break;}
            else if (choice == 2){System.out.println("\n\"Poached eggs on toast\" He bluntly replies.");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("\"Alright, I have one last question, then I'll let you go.\"\nYou better ask him something good.");
        System.out.println("\n1. \"What is the absolute worst that you believe you're capable of?\"");
        System.out.println("2. \"How do you like your steak done?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"I have access to Russia's nuclear launch codes, so probably a nuclear holocaust.\"\n\"I'm sorry, what?\"\n\"I said a nuclear holocaust is probably the worst I'm capable of.\" He replies at a louder volume.\nYou're, understandably, a little concerned.");;
            reportMeissner();
            break;}
            else if (choice == 2){System.out.println("\n\"I usually ask for medium well.\" He replies\n\"I'm a rare guy myself, I prefer a nice juicy steak.\"\n\"At least you aren't a degenerate who eats their steak blue\"\n\"Yeah, I can't understand why you'd do that to yourself\"");
            meissnerInterviewSuccessful();
            break;}
            else{System.out.println("Please enter a valid input");}}
        }
    
    //Call the police on him
    
    public static void reportMeissner() {
        System.out.println("\n1. Call the police");
        System.out.println("2. Leave it");
        while(true){
            System.out.print("\nMake your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){callPolice();
            break;}
            else if (choice == 2){meissnerInterviewSuccessful();
            break;}
            else{System.out.println("Please enter a valid input");}}
        }
    public static void callPolice() {
        System.out.println("\n\"Listen Mr. Meissner, I'm alright with violent serial killings, but nuclear terrorism is too far. I'm going to have to call the poli-\"\nBefore you even get a proper chance to reply, Meissner pulls a firearm and shoots you seven times in the chest.\nYou look down at the damage and then look back at Meissner.\n\"You shot me!\" You say, absolutely distraught at the fact that a serial killer would shoot you.\nMeissner is shocked, he's probably used to watching people die after getting shot that many times.\nHe immediately tries to run. But is stopped and knocked unconscious by your producer.\nYou both take him to Germany and hand him over to authorities.\nYou receive some heavy praise from the public for finally catching such an infamous serial killer.\nThe episode goes viral quickly too, and is immediately considered to be among the greatest podcast episodes of all time.\nYou feel accomplished.");
        System.out.println("\nThe End: Catcher of Killers");
        caughtMeissner = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    //Let him go/don't ask him question 4a
    
    public static void meissnerInterviewSuccessful() {
        System.out.println("\n\"Well thank you so much for your time Mr. Meissner, it was a pleasure to have you on the show.\" You say.\n\"Of course Stanley, It was an absolute pleasure to be here as well.\" He says as he gets up to shake your hand.\nBoth of you part ways.\nWhen the episode is released people are shocked and impressed at the fact that you managed to interview such an elusive figure.\nThe episode is praised heavily, and you go to sleep feeling incredibly accomplished.");
        System.out.println("\nThe End: Successful Interview");
        successfulInterview1 = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    //Ibrahim Moizoos
    
    public static void ibrahimMoizoos() {
        if(ghostToken){System.out.println("\nYou decide to stop being a ghost before you pass out for the next two days.");}
        else{System.out.print("\n");}
        System.out.println("After you sleep for 48 Hours straight, you get up and run to the studio.\nYou're ready to interview the most important football player in the world right now. Ibrahim Moizoos, the first single person to ever win a Super Bowl.\nAs you enter your studio ready to record, you meet with your producer, who greets you.\n\"Good morning Stanley, I hope you're ready to record today\" He says to you.");
        System.out.println("\n1. Let him know that you are");
        System.out.println("2. Tell him you need to warm up first\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"I suppose I'm as ready as I'll ever be! Let's get this show started!\" You say excitedly.");;
            break;}
            else if (choice == 2){System.out.println("\n\"Hold on, I need to warm up first.\"\nYour warm up consists of passionately singing the lyrics to \"Free Bird\" by Lynyrd Skynyrd before air guitaring the entire guitar solo.\nYour producer looks at you like you're a maniac.\nYou then do seven consecutive backflips, and watch as his face changes from confused, to impressed.\n\"Now I'm ready.\" You say with confidence.");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("You wait patiently for Ibrahim to show up.\nAfter waiting for about 4 hours, your producer walks up to you.\n\"Ibrahim Moizoos died this morning.\" He announces.\n\"Oh.\" You say in response.\nThat's a little disappointing.");
        System.out.println("\nThe End: Yea");
        successfulInterview2 = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    //Benedict Wombleton
    
    public static void benedictWombleton() {
        System.out.println("\nYou really thought that Wombleton's play sucked.\nBut it occurred to you that you really wanted to know what could drive someone to make something that bad.\nSo you choose to interview him, and go back to bed.\nAfter sleeping for the next two days, you head over to the studio, ready to record.");
        if(ghostToken){System.out.println("Before you arrive, you quickly return to a regular human from your ghostly form.");}
        System.out.println("You arrive to your producer, who immediately tells you that Mr. Wombleton had broken in earlier this morning and had spent the past seven hours in the recording booth waiting.\nFun.\nYou go inside to greet him.\nHe's incredibly white, with curly brown hair, wearing yellow plaid.\n\"If it isn't Benedict Wombleton! How are you?\" You say as you enter.\n\"Well of course things are going... swimmingly.\" Benedict responds in a clearly faked english accent.\n\"I'm absolutely honoured to be here today, Stanley.\"\n\"It's great to have you too, Mr. Wombleton.\"\nYou think of your first question.");
        System.out.println("\n1. \"What do you think makes your play important?\"");
        System.out.println("2. \"Why does your play actually suck so much?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"Echoes of Elysium: A Reverie in Seven Movements exists in the ethereal realm of transcendent thought, where the boundaries of reality blur and the echoes of antiquity reverberate through the corridors of consciousness, my play unfolds as a kaleidoscopic odyssey of the human condition. Set against the backdrop of an enigmatic dreamscape, where time is but a fleeting whisper and space an infinite canvas for the imagination to roam, this avant-garde masterpiece invites audiences to embark on a philosophical pilgrimage through the labyrinthine depths of existential inquiry.\"\nYou zone him out about halfway through, you don't know what any of the words he's saying mean.\n\"Within the mystical tapestry of this theatrical opus, fragmented memories intertwine with the symphonic resonance of forgotten truths, weaving a mesmerizing tableau of passion, longing, and redemption. Through a series of seven intricately choreographed movements, each a symphony of sights, sounds, and sensations, the boundaries of conventional narrative dissolve, giving rise to a transcendent exploration of the human psyche.\"\nYou still have no idea what he's going on about.\n\"As the boundaries between performer and spectator blur, the audience is beckoned into a realm where the very fabric of reality is woven from the threads of imagination. Through a mesmerizing fusion of avant-garde aesthetics, esoteric symbolism, and visceral emotion, \"Echoes of Elysium\" transcends the limitations of traditional storytelling, inviting each observer to become an active participant in the unfolding drama of existence itself.\"\nYou begin to feel incredibly tired.\n\"Amidst the haunting strains of an otherworldly score, the play confronts fundamental questions of identity, purpose, and the nature of reality, challenging viewers to peer beyond the veil of perception and glimpse the ineffable truths that lie hidden within the recesses of the soul. Through its audacious fusion of surreal imagery, existential inquiry, and transcendent beauty, \"Echoes of Elysium\" stands as a testament to the boundless potential of human creativity and the transformative power of art to illuminate the darkest corners of the human experience.\"\nYou've long zoned him out");
                System.out.println("\"Stanley? Hello? Stanley\"\n\"Oh! Yeah?\"\n\"Are you paying attention to me?\"\n\"Honestly no, you sound super pretentious, waffling about nonsense.\"\n\"What did you just say about me?\"\n\"Honestly? Your play sucks, like actually sucks.\"");
            break;}
            else if (choice == 2){System.out.println("\nHe looks like he wants to skin you alive.");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("\"Did you just say my play sucked?\"\n\"Yes, I did.\"\n\"HOW DARE YOU MAKE A MOCKERY OF ME LIKE THIS STANLEY!\"\nHe's standing up and screaming at you now.\n\"I BET YOU'LL REGRET THIS WHEN I BECOME MORE IMPORTANT THAN YOU!\"\n\"Dude, calm down please.\"\n\"I GRADUATED FROM THE ONETT SCHOOL OF FINE ARTS! I HAVE WORKED MY FINGERS TO THE BONE!\"\nHe continues to scream at you, blatantly ignoring your requests for him to calm down.\n\"YOU WILL SOON MEAN NOTHING WHEN COMPARED TO ME! JUST LIKE JACOB CALDWELL AND JAMES HARDY!\"\nYou recognize those names.\nThey're from his play, they stood out because they were the only normal names in the cast.\nThey were two characters who were sent to the depths of hell and experienced endless suffering beyond human comprehension.\n\"Aren't those characters from your play?\" You ask him.\n\"They're two DEGENERATES who bullied me in high school.\" Benedict states before beginning a long rant about everything they did to him.\nHowever, none of it is really that significant, nothing even close to real bullying, it fact it looks more like he treated them even worse.\nYou hear about that a lot. Clips of him exist online encouraging members of his cast to kill themselves over petty errors.\nYou soon realize that he's kind of a massive loser, who thinks everyone else is below him.\n\"Dude, you kind of suck.\" You say to him.\nHe looks absolutely furious. Beyond sickened that you'd say such a thing.\n\"I promise I will make you regret saying that.\" He says with almost murderous intent, before storming out of the studio.\nAs he leaves you think about how you really wish that you had chosen someone else to interview.");
        System.out.println("\nThe End: \"Successful\" Interview");
        successfulInterview3 = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    //Vilen Borshevik
    
    public static void vilenBorshevik() {
        System.out.println("You decide you want to interview Russian revolutionary Vilen Borshevik.\nYou obviously have no need for preparation, you'll just think of questions on the spot, so you sleep for the next two days.\n");
        if(ghostToken){System.out.println("You head off to the studio and nearly forget that you're a ghost, before quickly changing back.");}
        System.out.println("After arriving at the studio on the day of recording, your producer walks up to you with a greeting.\n\"Good morning Stanley, how are you?\" He politely asks.");
        System.out.println("\n1. Tell him you're doing okay");
        System.out.println("2. Tell him you're feeling abyssmal\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"I'm rather well, feeling pretty good about this interview.\"\n\"Glad to hear that, anyways, Mr. Borshevik has been here about half an hour already, should we begin?\"\n\"Yeah, let's begin.\"");
            break;}
            else if (choice == 2){System.out.println("\n\"Honestly, I'm doing pretty poorly, my wife left me and now everything sucks.\"\n\"Stanley, you aren't married.\"\n\"Exactly, because my wife left me I'm no longer married.\"\n\"No Stanley, you were never married to begin with.\"\nCompletely ignoring him, you enter the recording booth and welcome in Vilen Borshevik.");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("Mr. Borshevik wears an ushanka, an old Russian military jacket, has a massive beard, and an incredibly strong accent.\n\"Glorious day comrade!\" He says as he greets you.\n\"Glorious day to you as well Mr. Borshevik! Happy to have you here.\"\nYou're ready to ask your first question.");
        System.out.println("\n1. \"Where would you place yourself on the political spectrum?\"");
        System.out.println("2. \"Exactly what are you trying to accomplish with your revolutionary actions?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"Ah! Politics is just noise to me! All I wish to achieve is a world for the people.\"\n\"So you're like a punk kinda guy? Standing up for the people?\"\n\"I am unaware of what a \"punk\" is but yes I wish to stand up for the people.\"\nYou're understandably a little confused as to how a revolutionary doesn't involve himself with politics, but it looks like he's got the spirit.");
            break;}
            else if (choice == 2){System.out.println("\n\"wish to achieve a world of pure equality for all, no more will regular people be powerful, instead we shall all own everything, the public will share the wealth it creates, with some government input here and there.\"\n\"So like communism?\"\n\"I believe that is what it is called, yes.\"");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("You consider what to ask as your second question.");
        System.out.println("\n1. \"Have you ever eaten chalk?\"");
        System.out.println("2. \"Are there any stories you'd be willing to share?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"I uh... I do not believe so, no.\"\n\"You should give it a shot, it's usually a little too chalky for most people, but it's a great source of calcium!\"\n\"Of course, yes, I understand.\"\n\"You probably shouldn't eat too much though, keep it moderated.\"");
            break;}
            else if (choice == 2){System.out.println("\n\"I do have an interesting one.\" He begins his story.\n\"It was pretty small but I do remember this one time when a political leader was touring another country, tensions between both were very high at the time and the driver ended up making a grave mistake after making a wrong turn.\"\nHe gives a little bit of a laugh before continuing his story.\n\"The political leader ended up shot dead by a terrorist group and apparently this BIG battle breaks out after.\"\nHe clears his throat.\n\"Anyways, I didn't hear much about it at the time but I did know the guy who shot him.\"");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("\"Well, I have a few more questions for you so-\" You get cut off by a violent explosion in the studio, knocking you unconscious.\nYou wake up in a dark room, tied to a chair, surrounded by men speaking Spanish.\nThey're angrily speaking to Vilen Borshevik, speaking something about him being a \"traitor\" who \"manipulated them for his cause\".\nThey notice that you've awoken and one walks over to you.\n\"Hello, Stanley.\" The man says to you in perfect English.\n\"We are the Jalisco New Generation Cartel, and you are going to die for this man's actions.\" He says, pointing to Vilen.\n\"Hey that's not cool, I don't wanna die.\" You say to the man.\nThe man looks like he's considering letting you go.\n\"Okay Stanley, because I'm such a massive fan of your podcast I'd be willing to let you go if you beat me in blackjack.\"\nYou appreciate his understanding, but there's only one problem.\nYou don't know how to play blackjack.\nHe takes out a cosmic deck of cards that you can draw any number from any amount of times.");
        blackjack();
    }
    
    //Blackjack
    
    public static void blackjack() {
        int playerCard1 = rand.nextInt(2,11);
        int playerCard2 = rand.nextInt(2,11);
        int opponentCard1 = rand.nextInt(2,11);
        int opponentCard2 = rand.nextInt(2,11);
        int playerTotal = playerCard1 + playerCard2;
        int opponentTotal = opponentCard1 + opponentCard2;
        System.out.println("You're given two cards, one worth "+playerCard1+" and the other worth "+playerCard2);
        System.out.println("The man, on the other hand has one card face up, worth "+opponentCard1+", the other is face down however.");
        System.out.println("\"Go.\" The man says to you.\n\"Uh... go fish?\"\n\"No, hit or stay.\"\nYou have no idea what either of those words mean\n\"Nevermind, I'll go first\"");
        while (true){
            if (playerTotal>21){System.out.println("\"That's a bust, you lose\" The man says");
            loseBlackjack();
            break;}
            int opponentAdd = (rand.nextInt(2,11));
            opponentTotal = opponentTotal + opponentAdd;
            System.out.println("Your opponent draws a card, this one is worth "+opponentAdd+" increasing his known total to "+(opponentTotal-opponentCard2));
            if (opponentTotal>21){System.out.println("\"Damn it, bust\" The man says.");
            winBlackjack();
            break;}
            System.out.println("\n1. Hit");
            System.out.println("2. Stay");
            System.out.print("Make your choice now: ");
            int hitOrStay = scan.nextInt();
            if (hitOrStay == 1){
                int playerAdd = rand.nextInt(2,11);
                playerTotal = playerTotal+playerAdd;
                System.out.println("You draw a card worth "+playerAdd+" increasing your total to "+playerTotal);}
            else if (hitOrStay == 2){stay(playerTotal,opponentTotal);
                break;}
            else{System.out.println("Please enter a valid input");}
        }
        }
    public static void stay(int playerTotal, int opponentTotal) {
       if (Math.max(playerTotal,opponentTotal) == playerTotal){System.out.println("\"You're closer to 21, you win\" The man says to you");
                winBlackjack();}
        else if (Math.max(playerTotal,opponentTotal) == opponentTotal){System.out.println("\"Looks like I'm closer to 21, I win\" The man says to you");
                loseBlackjack();} 
    }
    
    public static void winBlackjack() {
        System.out.println("\"Nice job Stanley, you're free to go.\"\nAs you walk out of the room you notice that Vilen had long slipped away, likely using his revolutionary escape methods.\nYou head back home and think about how that interview probably could've gone better, but nevertheless, you are still alive.");
        System.out.println("\nThe End: Not-so Successful Interview");
        successfulInterview4 = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    public static void loseBlackjack() {
        System.out.println("\"Such a shame, Stanley, but it appears this is the end for you.\"\nYou still don't really want to die so you light into a mass of blue fire, burning through your restraints and walk out through the walls, melting them.\n\"Hey wait! You didn't win, you can't go!\" The man says as you walk away from the now melting building ready to go back home.\nProbably shouldn't have picked a violent Russian revolutionary to interview but all turned out okay for you in the end.");
        System.out.println("\nThe End: Definitely an Interview");
        unsuccessfulInterview4 = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    //Lilja Heimission
    
    public static void liljaHeimission() {
        System.out.println("You decide to interview Lilja Heimission, something you are genuinely excited about because you actually really like her music.\nYou spend the next two days sleeping, before waking up and hurrying off to the studio.");
        if(ghostToken){System.out.println("As normal, you stop being a ghost before you get there.");}
        System.out.println("As you greet your producer, you decide to:");
        System.out.println("\n1. Nicely shake his hand and exchange pleasantries.");
        System.out.println("2. Violently try to yank his arm out of its socket.\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"Good morning Mr. Producer Sir!\" You say as you nicely shake your producer's hand.\n\"Good morning to you as well, Stanley.\"\n\"Are we ready to start?\"\n\"Not yet, I've been informed that Ms. Heimission will be a couple of minutes later than expected.\"");
            break;}
            else if (choice == 2){System.out.println("\nYou run up to your producer and pull on his arm as hard as you can.\nHe gives you a look of disappointment before pulling his arm out of your grip.\n\"Good morning, Stanley.\" He says in a slightly upset tone.\nYou're definitely disappointed by the unsuccessful attempt at removing the producer's arm, but your disappointment grows as he tells you that Ms. Heimission will be a few minutes late.");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("After setting up and waiting a little, Lilja eventually shows up.\n\"Morning Stanley!\" Lilja says with a smile.\n\"Good morning to you as well!\" You reply, shaking hands.\nAfter you finish exchanging greetings, you think about your first question.");
        System.out.println("\n1. \"Who would you name as your greatest musical inspiration?\"");
        System.out.println("2. \"What instrument do you consider yourself to be the most skilled in?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"I'd have to say Radiohead.\" She answers.\n\"Nice! I've always been a pretty big fan of their stuff!\" You reply in excitement.\nThis leads into a rather long talk about how Radiohead had influenced both her musical taste, and musical style.\nIt's actually rather fascinating to listen to.\nThe conversation ends when you both come to a firm agreement that In Rainbows is the best Radiohead album.");
            break;}
            else if (choice == 2){System.out.println("\n\"I actually played bass in high school, ended up being really good at it by the end.\" She answers.\nYou react with surprise initially, but it makes significantly more sense when you consider the complexity of the basslines in her earlier work.\nIt's just become less prominent as her style evolved.");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("You prepare your next question.");
        System.out.println("\n1. \"Have you ever eaten chalk?\"");
        System.out.println("2. \"Do you have a favourite music video director?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"No, I have not. Why?\" Responds Lilja\n\"Oh I was just curious, that's all.\"");
            break;}
            else if (choice == 2){System.out.println("\n\"Chris Cunningham, no question about it.\"\n\"Do you have a favourite of his stuff?\"\n\"If we want to count it then definitely Rubber Johnny, his work on the effects is just unbelievable\"\nShe proceeded to talk about how surreal his visual style is, and how she feels that it couldn't be replicated.\nClearly, she has quite a lot of respect for him.");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("You think of what to ask next");
        System.out.println("\n1. \"What kind of music would you make if you didn't make pop?\"");
        System.out.println("2. \"What would you do if you weren't a musician?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"I'd LOVE to compose classical music!\"\n\"Y'know that actually makes a lot of sense, do you happen to have a favourite composer?\"\n\"Dmitri Shostakovich is a big one I like, Hans Zimmer is another more modern one too.\"\nYou proceed to talk about the underappreciated influence of classical on modern day music, finishing by agreeing that The Who were kind of overrated");
            break;}
            else if (choice == 2){System.out.println("\n\"I wouldn't mind being a therapist.\"\n\"You think you're good enough at understanding emotions to be one?\"\n\"Who knows, but in this hypothetical universe where I am one I'd assume I'm educated.\"\n\"Fair enough, you see it more as a \"what could've been\" over some kind of back up plan.\"\n\"Yeah, I love making music and genuinely don't know what else I'd do.\"");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("You get ready to ask the final question of the interview.");
        System.out.println("\n1. \"Why did you become a musician?\"");
        System.out.println("2. \"What do you think of Whitehouse?\"\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\n\"I've always been impressed by how much effect music can have. I mean it's essentially patterned noise but it gets people to feel so much, it was always really impressive to me.\"\n\"Yeah, probably one of the coolest aspects of it to me as well.\"\n\"I've listened to music that has touched me in ways no other form of art can, I might be biased but music is incredibly powerful, and I think I just wanted to harness that power, and do anything I wanted with it.\"");
            break;}
            else if (choice == 2){System.out.println("\n\"I don't wanna talk about Whitehouse.\"\n\"Fair.\"");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("\"Thank you so much for your time Ms. Heimission.\" You say to her, acknowledging that the interview is coming to an end.\n\"My pleasure, seriously.\" She replies with a warm smile.\nAs the interview comes to an end, you feel like it went really well, and believe that you absolutely picked the right person to interview.");
        System.out.println("\nThe End: Successful Interview");
        successfulInterview5 = true;
        boolean playAgainChoice = playAgain();
        if (playAgainChoice&&wipedFromExistence&&diedTwice&&bullyNeighbor&&cosmicApex&&epicRobotFight&&brothersAfterAll&&caughtMeissner&&successfulInterview1&&successfulInterview2&&successfulInterview3&&successfulInterview4&&unsuccessfulInterview4&&successfulInterview5){trueEnding();}
        else if (playAgainChoice){start();}
    }
    
    //True Ending
    
    public static void trueEnding() {
        System.out.println("\nYou wake up at precisely 7:24 in the morning.\nHold on... something feels different.\nLike, REALLY different from normal.\nYou try to think back to yesterday but it all feels the same.\nYou begin to remember nearly everything, the masked shadow dictator that rules the world, your neighbor's plot to end the world, making amends with your brother.\nOf course, the giant robot battle too, which easily still stands as the coolest thing you've ever done.\nNow that it's flooding back to you, you begin to feel a little uneasy.\nWhy are you waking up 35 minutes later than usual?\nWhy do you seem to have memories of past lives?\nWho exactly was that masked guy?\nYou have a choice here, either go out into the world and figure out what's happening, or sit around and ask more questions.");
        System.out.println("\n1. Go and find answers");
        System.out.println("2. Sit around and think for a bit longer\n");
        while(true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){System.out.println("\nThoroughly confused, you decide to set out for answers");
            break;}
            else if (choice == 2){System.out.println("\nYou sit around and ask a couple more questions.\nAfter your thoughts are thoroughly provoked, you decide that you're ready.");
            break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("You step outside of your apartment, unsure of what to do next.");
        System.out.println("\n1. Call Kyle");
        System.out.println("2. Call your producer");
        System.out.println("3. Look around for answers yourself\n");
        while (true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){trueEndingCallKyle();
            break;}
            else if (choice == 2){callProducer();
            break;}
            else if (choice == 3){findAnswers();
            break;}
            else{System.out.println("Please enter a valid input");}}
    }
    
    //Unsuccessful phone calls
    
    public static void trueEndingCallKyle() {
        String option1 = "Call your producer";
        String option2 = "Look around for answers yourself";
        System.out.println("\nYou call Kyle's number.\nHe doesn't pick up.\nThat's out of character for him.\nYou think of some other options");
        if (getChoice(option1,option2)){callProducerSecond();}
        else{findAnswers();}
    }
    
    public static void callProducer() {
        String option1 = "Call Kyle";
        String option2 = "Look around for answers yourself";
        System.out.println("\nYou decide to call your producer.\nHe's a trustworthy guy, you're sure he'll know something.\nHe doesn't pick up\nYou call again.\nNothing.\nYou consider your options");
        if (getChoice(option1,option2)){callKyleSecond();}
        else{findAnswers();}
    }
    
    public static void callProducerSecond() {
        System.out.println("\nWith Kyle being unavailable, you decide to call your producer instead.\nSimilarly, you get no response.\nIt looks like you need to do this yourself.");
        System.out.println("\n1. Look around for answers yourself\n");
        while (true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){findAnswers();
            break;}
            else{System.out.println("Please enter a valid input");}}
    }
    
    public static void callKyleSecond() {
        System.out.println("\nWith your producer refusing to respond, you decide you should probably call Kyle.\nNothing, he doesn't pick up.\nLooks like there's only one option left.");
        System.out.println("\n1. Look around for answers yourself\n");
        while (true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){findAnswers();
            break;}
            else{System.out.println("Please enter a valid input");}}
    }
    
    //The actual contents of the ending
    
    public static void findAnswers() {
        System.out.println("\nYou step outside of your apartment, still unsure of where to start.\nBut then you see him, the same masked man you saw talking to the president, the same one that gave you the robot.\n\"Good morning Stanley. You slept in, I see.\" The man says as he greets you.\n\"What's your deal man? What exactly is all of this?\" You reply.\n\"We'll need a bit of an exposition dump for that, but I assume you have at least minor awareness of the time loop?\"\n\"Oh is that what this is?\"\n\"I believe so, yes. Either way, I need you to come with me.\"");
        System.out.println("\n1. Go with him");
        System.out.println("2. Resist\n");
        while (true){
            System.out.print("Make your choice now: ");
            int choice = scan.nextInt();
            if (choice == 1){break;}
            else if (choice == 2){break;}
            else{System.out.println("Please enter a valid input");}}
        System.out.println("\"No, no more choices, I'm going to end this and I need your cooperation to do that.\"\nThe man opens a portal beneath you, and you fall through.\n\"I've monitored the space-time continuum and noticed something incredibly peculiar.\"\nThe man snaps his fingers, and the walls around you fall, revealing that you're positioned on the top of a massive skyscraper.\n\"Timelines have been jumping around constantly, stopping, starting, all without any warning, until I started paying attention to you.\"\n\"Me?\"\n\"The loops seem to revolve around you and your brother, starting when your brother wakes up to interview Rachel, with you asleep, and ending a couple of days later whenever you die, or finish an interview.\"\nHe clears his throat.\n\"As a result, every living being in the omniverse is stuck in this little frame of time, with their fates dictated by your actions.\"\n\"So... what are we gonna do?\"\n\"I've killed you in several of these time loops, and that doesn't do anything. But if I kill you and your brother, forever, then the loop has no place to go back to, and as a result nothing will happen if it ends.\"\nYou're definitely a little shocked that this guy is willing to admit that he's going to kill you and your brother, but also kind of impressed by his boldness.\n\"I'm not just going to let you kill me dude.\" You reply to him.\n\"I figured you'd say that.\"\nThe man snaps his fingers, freezing time into a single moment.\n\"I hope this won't be such a one-sided fight this time.\"\nUsually, you wouldn't be phased by an arrogant remark like that, but this man has proven himself to be a threat, you need to exercise caution.\nThe fight begins, you both exchange blows and blast giant, incredibly powerful, multi-coloured beams at each other.");
        System.out.println("However, it's pretty clear that you don't have the upper hand in this fight, and you end up critically injured, kneeling on the ground because of it.\n\"You fought better than last time, Stanley.\" The man says as he approaches you.\n\"But your fate is the same regardless.\"\nHe places his hand on your shoulder, and starts to erase you.\nThat's it then, it's over.\nBut you aren't gone yet.\nIt's a strange feeling, like you're drifting between a state of sleep and clarity, it's disorienting.\nYou're dead though right?\nHe erased you from existence, and you definitely FEEL dead.\nBut you're clinging on to something.\nYou're clinging on to him.\nIt seems like he ended up absorbing you, he probably tried to absorb your cosmic powers, and destroy whatever was left, to unsuccessful results.\nRegardless, you still don't have a physical body anymore, so you can't do anything regardless.\nBut you feel something else now too.\nYou can see into these other timelines, so clearly it feels like you could touch them.\nLike you could move them, or stretch them out, or some other third option.");
        System.out.println("So you reach into them and grab yourself.\nYou need a body to live in so you grab one from a timeline where you fell down four-hundred flights of stairs and died.\nThere you are, awake at the bottom of a stairwell, bones broken, but filled with determination.\nYou quickly heal yourself and realize you can still see all of the timelines.\nStrange.\nYou look around for where you just were, you need to go back and save your brother.\nIt takes some time, but you find it.\nUpon returning to your timeline you find the world in shambles, again, but that isn't your problem right now, you need to find your brother.\nBut you can see him, not physically but you see him through someone else's eyes.\nThat same masked man's eyes.\nWhatever he did to you, he seems to have made some sort of non-severable psychic connection.\nYou don't have your powers anymore though, so you just start booking it to wherever he is.\nAfter about 27 minutes of running as fast as you can, you make it to where Kyle and the masked man are fighting.");
        System.out.println("\"Stop! I demand that you let my brother go!\" You scream at the top of your lungs.\n\"Stanley? I took you for dead.\" The masked man coldly responds.\n\"You failed to erase every last bit of me, and that mistake is going to cost you your life.\"\n\"Stanley, be realistic, you don't have your cosmic powers anymore, what could you possibly do to me?\"\n\"This.\"\nYou snap your fingers, and just like that, every single timeline you've lived through becomes one.\nThe masked man is shocked.\n\"How... How did you do that?\" He asks, clearly startled.\n\"Because I'm a part of you now, and I understand exactly how you caused this time loop.\"\nYou don't understand, but you did manage to come to the conclusion that he had been controlling it somehow.\nI mean why else would you suddenly have the ability to control it after being semi-infused with him?\n\"Prepare to meet your end.\" You say to the man, sounding as badass as possible.\nAnd then everything attacks him.\nInfinite versions of you, numerous versions of everyone you've interviewed, versions of Glosh'gath, the Writhing Abyssal Devourer of Aetheric Realms, Herald of the Everlasting Eclipse, Spawn of the Unfathomable Void, Harbinger of Cosmic Entropy, and Bringer of the Final Cataclysm that you’ve managed to befriend, and everything else from the uncountable amount of lives you've lived turns on this man to destroy him.\nDespite this though, the masked man is still doing an impressive job on everything attacking him.\nBut you know he'll falter soon enough, so you go to check on your brother.");
        System.out.println("\"Hey Kyle.\"\n\"What's going on Stan?\"\n\"I'm going to see if I can get you to remember something.\"\nYou place your fingers on Kyle's forehead, and channel all of his memories from alternate timelines into his head.\nHe looks a little confused initially, but seems to eventually get it.\nEvidently, he never became aware like you did.\n\"So... This guy put us in a time loop why?\" Kyle asks.\n\"I'd assume it was just a ploy for power, if you could stack the power of two cosmic gods onto your own supply wouldn't you?\"\n\"Honestly no, I think I'd be okay living with Rachel for the rest of my life.\"\n\"Thank you Kyle, you're so kind and humble.\"\n\"Quiet.\"\nYou continue to talk about everything you could.\nHonestly it feels pretty good to be back there, in that timeline you reconnected with him.\nYou talk until the fighting dies down, until a victor rises from the smoke.\nBut the victor is him, that same masked man.");
        System.out.println("\"It seems... no version of you is ever capable of stopping me.\" He says, clearly out of breath and exhausted.\n\"Can we just kill this guy now Kyle?\" You ask your brother.\n\"Yeah sure\"\n\"Wait! I... I just-\" He starts trying to take his mask off, and once he succeeds, his identity is revealed.\nIt's your producer, both yours and Kyle's.\n\"I know you don't need me anymore Kyle, with your super criminal wife or whatever. But you Stanley...\"\nHe's clearly out of breathe.\n\"You still need me for your show.\"\n\"I can actually just fire you, it isn't like-\"\nYou're cut off by a violent burning sensation in your stomach.\nIt's a bullet hole.\n\"You get what you deserve.\" You hear a voice say.\nYou turn around to look, and it's Benedict Wombleton, a man who is apparently willing to kill you over disliking his play.\nKyle immediately panics, rushing to put pressure over your wounds.\nBut Benedict is ready to finish you off.\n\"No, Wombleton, come... come with me.\" Your producer says as he gestures towards himself.\n\"I'm sure I could take you someplace where you could have everything you've ever wanted.\"\n\"How could you possibly do such a thing?\" Benedict responds, bringing back his fake english accent.\nYour producer pulls a small device out of his pocket and punches in a couple numbers into a keypad.\n\"Just... wait a second...\"\nIt takes about 24 seconds of waiting in dead silence for whatever you're waiting for to happen.\nEventually, a mechanical capsule floats over and lands next to your producer.\n\"You see Stanley, this is why it's always helpful to have a last resort.\"\nHe places his mask back on his face, and begins to step into the pod.\n\"Come along Wombleton, we have many places to be.\"");
        System.out.println("Benedict skedaddles along into the pod and ducks into the back.\n\"I am resigning from my position, I appreciate the opportunities you've given me, and I wish you all the best, goodbye Kyle, goodbye Stanley.\"\nBefore he has a chance to escape, Kyle fires another super beam at him.\nIn response, your producer raises his right hand, stopping it in mid air.\n\"What a lovely farewell gift, I appreciate your generosity.\"\nYour producer finishes stepping into his escape pod, and seemingly disappears into thin air.\nJust in time for you to pass out from your gunshot wound, convenient.\nThat's such a common trope at this point though, you'd be crazy if you thought anything else would happen.");
        System.out.println("It takes about two days for you to wake up.\nOnce you do, you awaken to the world in utter disarray.\nAfter all, you did just blindly fuse a nigh-infinite amount of alternate timelines together, that usually doesn't end well.\nAnyways, you still seem to hold that psychic link with your producer, meaning that you still hold some control over the timelines.\nIt takes some effort, but whilst laying in your hospital bed you clean up the timestream, creating what you deem to be the best possible timeline.\nRecovery takes a couple of days, with the news monitoring your every move, as you are still incredibly famous, and they can't focus on Kyle now that he's taking a \"short break\".\nIt's nice though, to see that everything is okay in the end.\nIbrahim Moizoos never ended up dying.\nLilja Heimission went on to do everything she ever could've wanted, including making a video with Chris Cunningham.\nMeissner and Borshevik went on to vanish into the void, disappearing completely.\nMiranda ends up in a mental institution, as far from anything occult as possible.\nAnd you end up so much happier than you did when you started this.\nYou started spending more time with your neighbor, helping him get his life back together, and making a new friend in the process.\nYou keep in contact with your brother, eventually meeting Rachel, and attending his wedding.\nHis type was always professional criminals.\nBut you keep a good relationship with him, and it feels so much better than just being better than him.\nThe only thing really left unresolved is the status of Benedict and your producer.\nYou can still see through his eyes, he's off someplace else, attempting to ascend further beyond ultimate power.\nYou can tell he's hellbent on laying the groundwork for a sequel.\nBut you still feel good, and you've grown a greater appreciation for everything you do.\nIn the end, it didn't matter that Stanley was famous, it only mattered that Stanley was happy.");
        System.out.println("\nThe End: For Real This Time");
    }
        
}
