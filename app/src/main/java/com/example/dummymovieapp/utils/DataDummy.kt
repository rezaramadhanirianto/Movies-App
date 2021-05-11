package com.example.dummymovieapp.utils

import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.TvShowEntity
import com.example.dummymovieapp.data.source.remote.response.MovieResponse
import com.example.dummymovieapp.data.source.remote.response.TvShowResponse

object DataDummy {
    fun getMovies(): List<MovieEntity>{
        var movies = ArrayList<MovieEntity>()
        movies.add(
            MovieEntity(
                "460465",
                "Mortal Kombat",
                "2021-04-07",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                4.0

            )
        )
        movies.add(
            MovieEntity(
                "399566",
                "Godzilla vs. Kong",
                "2021-03-24",
                "https://image.tmdb.org/t/p/w500/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                4.1
            )
        )
        movies.add(
            MovieEntity(
                "632357",
                "The Unholy",
                "2021-04-07",
                "https://image.tmdb.org/t/p/w500/zDq2pwPyt4xwSFHKUoNN2LohDWj.jpg",
                "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                4.1

            )
        )
        movies.add(
            MovieEntity(
                "791373",
                "Zack Snyder's Justice League",
                "2021-03-18",
                "https://image.tmdb.org/t/p/w500/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                4.2
            )
        )
        movies.add(
            MovieEntity(
                "460495",
                "Nobody",
                "2021-03-18",
                "https://image.tmdb.org/t/p/w500/6zbKgwgaaCyyBXE4Sun4oWQfQmi.jpg",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                3.9
            )
        )
        movies.add(
            MovieEntity(
                "634528",
                "The Marksman",
                "2021-01-15",
                "https://image.tmdb.org/t/p/w500/6vcDalR50RWa309vBH1NLmG2rjQ.jpg",
                "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                3.9
            )
        )
        movies.add(
            MovieEntity(
                "635302",
                "Demon Slayer -Kimetsu no Yaiba- The Movie: Mugen Train",
                "2020-10-16",
                "https://image.tmdb.org/t/p/w500/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg",
                "Tanjiro Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyojuro Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!",
                3.4
            )
        )
        movies.add(
            MovieEntity(
                "615678",
                "Thunder Force",
                "2021-04-09",
                "https://image.tmdb.org/t/p/w500/duK11VQd4UPDa7UJrgrGx90xJOx.jpg",
                "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
                3.4

            )
        )
        movies.add(
            MovieEntity(
                "412656",
                "Chaos Walking",
                "2021-04-07",
                "https://image.tmdb.org/t/p/w500/ovggmAOu1IbPGTQE8lg4lBasNC7.jpg",
                "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.",
                3.1
            )
        )
        movies.add(
            MovieEntity(
                "587996",
                "Bajocero",
                "2021-01-29",
                "https://image.tmdb.org/t/p/w500/6TPZSJ06OEXeelx1U1VIAt0j9Ry.jpg",
                "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a silent foe: the icy temperatures.",
                4.3
            )
        )
        return movies
    }

    fun getTvShows(): List<TvShowEntity>{
        var tvShows = ArrayList<TvShowEntity>()

        tvShows.add(
            TvShowEntity(
                "88396",
                "The Falcon and the Winter Soldier",
                "2021-03-19",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                4.5
            )
        )
        tvShows.add(
            TvShowEntity(
                "71712",
                "The Good Doctor",
                "2017-09-25",
                "https://image.tmdb.org/t/p/w500/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                4.6
            )
        )
        tvShows.add(
            TvShowEntity(
                "60735",
                "The Flash",
                "2021-03-19",
                "https://image.tmdb.org/t/p/w500/z59kJfcElR9eHO9rJbWp4qWMuee.jpg",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \\\"meta-human\\\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash",
                4.9
            )
        )
        tvShows.add(
            TvShowEntity(
                "79008",
                "Luis Miguel: The Series",
                "2018-04-22",
                "https://image.tmdb.org/t/p/w500/wkyzeBBKLhSg1Oqhky5yoiFF2hG.jpg",
                "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.",
                4.0
            )
        )
        tvShows.add(
            TvShowEntity(
                "1416",
                "Grey's Anatomy",
                "2005-03-27",
                "https://image.tmdb.org/t/p/w500/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                4.0

            )
        )
        tvShows.add(
            TvShowEntity(
                "65820",
                "Van Helsing",
                "2021-03-19",
                "https://image.tmdb.org/t/p/w500/5VltHQJXdmbSD6gEJw3R8R1Kbmc.jpg",
                "Vanessa Helsing, the daughter of famous vampire hunter and Dracula nemesis Abraham Van Helsing is resurrected five years in the future to find out that vampires have taken over the world and that she possesses unique power over them. She is humanity’s last hope to lead an offensive to take back what has been lost.",
                4.6
            )
        )
        tvShows.add(
            TvShowEntity(
                "69050",
                "Riverdale",
                "2017-01-26",
                "https://image.tmdb.org/t/p/w500/qZtAf4Z1lazGQoYVXiHOrvLr5lI.jpg",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                4.6
            )
        )
        tvShows.add(
            TvShowEntity(
                "80240",
                "The Queen of Flow",
                "2018-02-02",
                "https://image.tmdb.org/t/p/w500/lKGi8u6l5PJVSAdOazHjt0n3wHZ.jpg",
                "After spending seventeen years in prison unfairly, a talented songwriter seeks revenge on the men who sank her and killed her family.",
                4.2
            )
        )
        tvShows.add(
            TvShowEntity(
                "77169",
                "Cobra Kai",
                "2018-05-02",
                "https://image.tmdb.org/t/p/w500/gL8myjGc2qrmqVosyGm5CWTir9A.jpg",
                "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                4.6
            )
        )
        tvShows.add(
            TvShowEntity(
                "44217",
                "Vikings",
                "2018-01-01",
                "https://image.tmdb.org/t/p/w500/aq2yEMgRQBPfRkrO0Repo2qhUAT.jpg",
                "The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.",
                4.6
            )
        )


        return tvShows
    }

    fun getMoviesResponse(): List<MovieResponse>{
        val movies = ArrayList<MovieResponse>()
        movies.add(
            MovieResponse(
                "460465",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "2021-04-07",
                4.0,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",


            )
        )
        movies.add(
            MovieResponse(
                "399566",
                "Godzilla vs. Kong",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "2021-03-24",
                4.1,
                "https://image.tmdb.org/t/p/w500/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",

            )
        )
        movies.add(
            MovieResponse(
                "632357",
                "The Unholy",
                "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                "2021-04-07",
                4.1,
                "https://image.tmdb.org/t/p/w500/zDq2pwPyt4xwSFHKUoNN2LohDWj.jpg",

            )
        )
        movies.add(
            MovieResponse(
                "791373",
                "Zack Snyder's Justice League",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "2021-03-18",
                4.2,
                "https://image.tmdb.org/t/p/w500/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "460495",
                "Nobody",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "2021-03-18",
                3.9,
                "https://image.tmdb.org/t/p/w500/6zbKgwgaaCyyBXE4Sun4oWQfQmi.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "634528",
                "The Marksman",
                "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                "2021-01-15",
                3.9,
                "https://image.tmdb.org/t/p/w500/6vcDalR50RWa309vBH1NLmG2rjQ.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "635302",
                "Demon Slayer -Kimetsu no Yaiba- The Movie: Mugen Train",
                "Tanjiro Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyojuro Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!",
                "2020-10-16",
                3.4,
                "https://image.tmdb.org/t/p/w500/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "615678",
                "Thunder Force",
                "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
                "2021-04-09",
                3.4,
                "https://image.tmdb.org/t/p/w500/duK11VQd4UPDa7UJrgrGx90xJOx.jpg",

            )
        )
        movies.add(
            MovieResponse(
                "412656",
                "Chaos Walking",
                "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.",
                "2021-04-07",
                3.1,
                "https://image.tmdb.org/t/p/w500/ovggmAOu1IbPGTQE8lg4lBasNC7.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "587996",
                "Bajocero",
                "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a silent foe: the icy temperatures.",
                "2021-01-29",
                4.3,
                "https://image.tmdb.org/t/p/w500/6TPZSJ06OEXeelx1U1VIAt0j9Ry.jpg",
            )
        )
        return movies
    }

    fun getTvShowsResponse(): List<TvShowResponse>{
        var tvShows = ArrayList<TvShowResponse>()

        tvShows.add(
            TvShowResponse(
                "88396",
                "The Falcon and the Winter Soldier",
                "2021-03-19",
                4.5,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )
        tvShows.add(
            TvShowResponse(
                "71712",
                "The Good Doctor",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                4.6,
                "https://image.tmdb.org/t/p/w500/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
            )
        )
        tvShows.add(
            TvShowResponse(
                "60735",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \\\"meta-human\\\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash",
                4.9,
                "https://image.tmdb.org/t/p/w500/z59kJfcElR9eHO9rJbWp4qWMuee.jpg",
            )
        )
        tvShows.add(
            TvShowResponse(
                "79008",
                "Luis Miguel: The Series",
                "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.",
                4.0,
                "https://image.tmdb.org/t/p/w500/wkyzeBBKLhSg1Oqhky5yoiFF2hG.jpg",

            )
        )
        tvShows.add(
            TvShowResponse(
                "1416",
                "Grey's Anatomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                4.0,
                "https://image.tmdb.org/t/p/w500/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg",
            )
        )
        tvShows.add(
            TvShowResponse(
                "65820",
                "Van Helsing",
                "Vanessa Helsing, the daughter of famous vampire hunter and Dracula nemesis Abraham Van Helsing is resurrected five years in the future to find out that vampires have taken over the world and that she possesses unique power over them. She is humanity’s last hope to lead an offensive to take back what has been lost.",
                4.6,
                "https://image.tmdb.org/t/p/w500/5VltHQJXdmbSD6gEJw3R8R1Kbmc.jpg",
            )
        )
        tvShows.add(
            TvShowResponse(
                "69050",
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                4.6,
                "https://image.tmdb.org/t/p/w500/qZtAf4Z1lazGQoYVXiHOrvLr5lI.jpg",
            )
        )
        tvShows.add(
            TvShowResponse(
                "80240",
                "The Queen of Flow",
                "After spending seventeen years in prison unfairly, a talented songwriter seeks revenge on the men who sank her and killed her family.",
                4.2,
                "https://image.tmdb.org/t/p/w500/lKGi8u6l5PJVSAdOazHjt0n3wHZ.jpg",
            )
        )
        tvShows.add(
            TvShowResponse(
                "77169",
                "Cobra Kai",
                "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                4.6,
                "https://image.tmdb.org/t/p/w500/gL8myjGc2qrmqVosyGm5CWTir9A.jpg",
            )
        )
        tvShows.add(
            TvShowResponse(
                "44217",
                "Vikings",
                "The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.",
                4.6,
                "https://image.tmdb.org/t/p/w500/aq2yEMgRQBPfRkrO0Repo2qhUAT.jpg",
            )
        )


        return tvShows
    }
}