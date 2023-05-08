package com.dbose.repository

import com.dbose.model.ApiResponse
import com.dbose.model.Hero

class HeroRepositoryImpl : HeroRepository {
    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5,
        )
    }
    override val page1: List<Hero> = listOf(
        Hero(
            id = 1,
            name = "Superman",
            image = "/images/superman.jpg",
            about = "The last son of Krypton, Superman possesses incredible powers and is dedicated to protecting humanity.",
            rating = 9.5,
            power = 100,
            month = "June",
            day = "30",
            family = listOf("Jonathan Kent", "Martha Kent"),
            abilities = listOf("Super strength", "Flight", "Heat vision", "X-ray vision"),
            natureTypes = listOf("Kryptonian", "Solar energy")
        ),
        Hero(
            id = 2,
            name = "Batman",
            image = "/images/batman.jpg",
            about = "A billionaire playboy and philanthropist by day, Batman is a fearsome crimefighter by night.",
            rating = 9.0,
            power = 90,
            month = "September",
            day = "23",
            family = listOf("Thomas Wayne", "Martha Wayne"),
            abilities = listOf("Detective skills", "Combat training", "Gadgets"),
            natureTypes = listOf("Human")
        ),
        Hero(
            id = 3,
            name = "Wonder Woman",
            image = "/images/wonderwoman.jpg",
            about = "An Amazon princess with incredible strength, speed, and agility, Wonder Woman fights for justice and peace.",
            rating = 8.5,
            power = 95,
            month = "July",
            day = "1",
            family = listOf("Hippolyta", "Zeus"),
            abilities = listOf("Super strength", "Lasso of Truth", "Bracelets of Submission"),
            natureTypes = listOf("Amazonian", "Greek god")
        ),
        Hero(
            id = 4,
            name = "Spider-Man",
            image = "/images/spiderman.jpg",
            about = "A high school student with spider-like powers, Spider-Man balances his superhero duties with his personal life.",
            rating = 8.0,
            power = 80,
            month = "August",
            day = "10",
            family = listOf("Richard Parker", "Mary Parker", "Ben Parker", "May Parker"),
            abilities = listOf("Web-slinging", "Spider sense", "Super strength"),
            natureTypes = listOf("Human", "Spider DNA")
        ),
        Hero(
            id = 5,
            name = "Iron Man",
            image = "/images/ironman.jpg",
            about = "A genius inventor and businessman, Iron Man uses his advanced armor to protect the world from threats.",
            rating = 9.0,
            power = 90,
            month = "May",
            day = "29",
            family = listOf("Howard Stark", "Maria Stark"),
            abilities = listOf("Powered armor", "Repulsor beams", "Flight"),
            natureTypes = listOf("Human", "Cyborg")
        )
    )
    override val page2: List<Hero> = listOf(
        Hero(
            id = 6,
            name = "Thor",
            image = "/images/thor.jpg",
            about = "The god of thunder and heir to the throne of Asgard, Thor wields his enchanted hammer Mjolnir in battle.",
            rating = 8.5,
            power = 85,
            month = "December",
            day = "20",
            family = listOf("Odin", "Frigga"),
            abilities = listOf("Mjolnir", "Super strength", "Weather control"),
            natureTypes = listOf("Asgardian", "God")
        ),
        Hero(
            id = 7,
            name = "Captain America",
            image = "/images/captainamerica.jpg",
            about = "A World War II super soldier, Captain America fights for American ideals and freedom.",
            rating = 8.0,
            power = 80,
            month = "July",
            day = "4",
            family = listOf("Sarah Rogers", "Joseph Rogers"),
            abilities = listOf("Super strength", "Shield", "Combat training"),
            natureTypes = listOf("Human", "Enhanced physiology")
        ),
        Hero(
            id = 8,
            name = "The Flash",
            image = "/images/theflash.jpg",
            about = "The fastest man alive, The Flash uses his superhuman speed to protect Central City.",
            rating = 8.5,
            power = 85,
            month = "March",
            day = "11",
            family = listOf("Henry Allen", "Nora Allen"),
            abilities = listOf("Super speed", "Time travel", "Phasing"),
            natureTypes = listOf("Human", "Metahuman")
        ),
        Hero(
            id = 9,
            name = "Green Lantern",
            image = "/images/greenlantern.jpg",
            about = "A member of the intergalactic Green Lantern Corps, Hal Jordan uses his power ring to create anything he can imagine.",
            rating = 8.0,
            power = 80,
            month = "January",
            day = "20",
            family = listOf("Martin Jordan", "Jessica Jordan"),
            abilities = listOf("Power ring", "Flight", "Energy constructs"),
            natureTypes = listOf("Human", "Alien technology")
        ),
        Hero(
            id = 10,
            name = "Aquaman",
            image = "/images/aquaman.jpg",
            about = "The king of Atlantis, Aquaman commands the creatures of the sea and uses his strength and endurance to protect the ocean.",
            rating = 8.5,
            power = 85,
            month = "February",
            day = "10",
            family = listOf("Atlan", "Atlanna"),
            abilities = listOf("Super strength", "Trident", "Telepathy"),
            natureTypes = listOf("Atlantean", "Human")
        )
    )
    override val page3: List<Hero> = listOf(
        Hero(
            id = 11,
            name = "Black Panther",
            image = "/images/blackpanther.jpg",
            about = "The king of Wakanda and protector of the nation's Vibranium, Black Panther uses his advanced technology and combat skills to defend his people.",
            rating = 8.5,
            power = 85,
            month = "February",
            day = "16",
            family = listOf("T'Chaka", "Ramonda"),
            abilities = listOf("Vibranium suit", "Superhuman senses", "Martial arts"),
            natureTypes = listOf("Human", "Heart-shaped herb")
        ),
        Hero(
            id = 12,
            name = "Hulk",
            image = "/images/hulk.jpg",
            about = "A brilliant scientist cursed with the power to transform into a giant, rage-filled monster, Hulk fights to control his anger and protect others.",
            rating = 9.0,
            power = 90,
            month = "November",
            day = "22",
            family = listOf("Brian Banner", "Rebecca Banner"),
            abilities = listOf("Super strength", "Durability", "Regeneration"),
            natureTypes = listOf("Human", "Gamma radiation")
        ),
        Hero(
            id = 13,
            name = "Doctor Strange",
            image = "/images/doctorstrange.jpg",
            about = "A former surgeon turned master of the mystic arts, Doctor Strange protects the world from supernatural threats.",
            rating = 8.5,
            power = 85,
            month = "August",
            day = "14",
            family = listOf("Eugene Strange", "Beverly Strange"),
            abilities = listOf("Magic", "Teleportation", "Astral projection"),
            natureTypes = listOf("Human", "Sorcerer")
        ),
        Hero(
            id = 14,
            name = "Captain America",
            image = "/images/captainamerica.jpg",
            about = "A super soldier and symbol of freedom, Captain America uses his strength and shield to protect the world from evil.",
            rating = 8.0,
            power = 80,
            month = "July",
            day = "4",
            family = listOf("Sarah Rogers", "Joseph Rogers"),
            abilities = listOf("Super strength", "Shield combat", "Leadership"),
            natureTypes = listOf("Human", "Super soldier serum")
        ),
        Hero(
            id = 15,
            name = "Black Widow",
            image = "/images/blackwidow.jpg",
            about = "A skilled spy and assassin, Black Widow uses her agility and fighting skills to take down dangerous targets.",
            rating = 7.5,
            power = 75,
            month = "November",
            day = "22",
            family = listOf("Ivan Petrovich", "Melina Vostokoff"),
            abilities = listOf("Combat training", "Espionage", "Gadgets"),
            natureTypes = listOf("Human", "Red Room training")
        )
    )
    override val page4: List<Hero> = listOf(
        Hero(
            id = 16,
            name = "Iron Man",
            image = "/images/ironman.jpg",
            about = "A billionaire inventor and genius, Iron Man uses his high-tech suit of armor to fight threats to humanity.",
            rating = 9.0,
            power = 90,
            month = "May",
            day = "29",
            family = listOf("Howard Stark", "Maria Stark"),
            abilities = listOf("Powered armor", "Flight", "Repulsor blasts"),
            natureTypes = listOf("Human", "Technology")
        ),
        Hero(
            id = 17,
            name = "Thor",
            image = "/images/thor.jpg",
            about = "The god of thunder and prince of Asgard, Thor wields his enchanted hammer to protect the Nine Realms.",
            rating = 9.0,
            power = 90,
            month = "August",
            day = "8",
            family = listOf("Odin", "Gaea"),
            abilities = listOf("Mjolnir", "Weather manipulation", "Super strength"),
            natureTypes = listOf("Asgardian", "Human")
        ),
        Hero(
            id = 18,
            name = "Spider-Man",
            image = "/images/spiderman.jpg",
            about = "A teenager with spider-like abilities, Spider-Man uses his web-slinging and wall-crawling to protect New York City.",
            rating = 8.0,
            power = 80,
            month = "August",
            day = "10",
            family = listOf("Richard Parker", "Mary Parker"),
            abilities = listOf("Web-slinging", "Spider-sense", "Agility"),
            natureTypes = listOf("Human", "Radioactive spider bite")
        ),
        Hero(
            id = 19,
            name = "Doctor Strange",
            image = "/images/doctorstrange.jpg",
            about = "A former surgeon turned master of the mystic arts, Doctor Strange uses his magic to defend reality from supernatural threats.",
            rating = 8.5,
            power = 85,
            month = "November",
            day = "4",
            family = listOf("Eugene Strange", "Beverly Strange"),
            abilities = listOf("Sorcery", "Teleportation", "Time manipulation"),
            natureTypes = listOf("Human", "Mystic arts")
        ),
        Hero(
            id = 20,
            name = "Captain Marvel",
            image = "/images/captainmarvel.jpg",
            about = "A former Air Force pilot imbued with cosmic powers, Captain Marvel uses her strength and energy projection to protect the universe.",
            rating = 9.0,
            power = 90,
            month = "March",
            day = "6",
            family = listOf("Joseph Danvers Sr.", "Marie Danvers"),
            abilities = listOf("Super strength", "Energy projection", "Flight"),
            natureTypes = listOf("Human", "Kree")
        )
    )
    override val page5: List<Hero> = listOf(
        Hero(
            id = 21,
            name = "Quicksilver",
            image = "/images/quicksilver.jpg",
            about = "A mutant with superhuman speed, Quicksilver uses his powers to run circles around his enemies and protect his family.",
            rating = 7.0,
            power = 70,
            month = "October",
            day = "14",
            family = listOf("Magneto", "Magda Lehnsherr"),
            abilities = listOf("Super speed", "Accelerated healing", "Enhanced metabolism"),
            natureTypes = listOf("Mutant", "Human")
        ),
        Hero(
            id = 22,
            name = "Ant-Man",
            image = "/images/antman.jpg",
            about = "A thief turned size-shifting superhero, Ant-Man uses his shrinking and growing abilities to take down his enemies.",
            rating = 7.0,
            power = 70,
            month = "June",
            day = "15",
            family = listOf("Hank Pym", "Janet van Dyne"),
            abilities = listOf("Pym particles", "Size manipulation", "Insect communication"),
            natureTypes = listOf("Human", "Pym particles")
        ),
        Hero(
            id = 23,
            name = "Wasp",
            image = "/images/wasp.jpg",
            about = "A founding member of the Avengers, Wasp uses her size-shifting and energy blasts to fight evil.",
            rating = 7.5,
            power = 75,
            month = "January",
            day = "29",
            family = listOf("Hank Pym", "Maria Trovaya"),
            abilities = listOf("Size manipulation", "Energy blasts", "Flight"),
            natureTypes = listOf("Human", "Pym particles")
        ),
        Hero(
            id = 24,
            name = "Vision",
            image = "/images/vision.jpg",
            about = "An android created by Ultron and later reprogrammed by the Avengers, Vision uses his density manipulation and energy projection to protect the world.",
            rating = 8.5,
            power = 85,
            month = "May",
            day = "5",
            family = listOf("Ultron", "Jocasta"),
            abilities = listOf("Density manipulation", "Energy projection", "Flight"),
            natureTypes = listOf("Synthezoid", "Android")
        ),
        Hero(
            id = 25,
            name = "Scarlet Witch",
            image = "/images/scarletwitch.jpg",
            about = "A mutant with reality-warping powers, Scarlet Witch uses her chaos magic to fight against evil and protect her loved ones.",
            rating = 8.0,
            power = 80,
            month = "February",
            day = "23",
            family = listOf("Magneto", "Magda Lehnsherr"),
            abilities = listOf("Reality manipulation", "Chaos magic", "Telekinesis"),
            natureTypes = listOf("Mutant", "Human")
        )
    )


    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page

        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..3) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchHeroes(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}