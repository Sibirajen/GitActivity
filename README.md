# GitHub Activity Tracker

This is a simple Java application that fetches and analyzes a GitHub user's recent activity using the GitHub Events API.
This project is a challenge from [GitHub User Activity](https://roadmap.sh/projects/github-user-activity)

## Prerequisites

- Java 11 or later
- Maven (optional, if you want to manage dependencies easily)
- Gson Library (Google's JSON parsing library)

## Installation

1. Clone this repository or copy the `GitHubActivity.java` file into your project.
2. Install the required Gson library using Maven or manually add the JAR file to your classpath.

   **Using Maven:**
   ```xml
   <dependencies>
       <dependency>
           <groupId>com.google.code.gson</groupId>
           <artifactId>gson</artifactId>
           <version>2.8.9</version>
       </dependency>
   </dependencies>
   ```

## Usage

Run the program with a GitHub username as an argument:

```sh
java GitHubActivity <github-username>
```

Example:

```sh
java GitHubActivity octocat
```

## Features

- Fetches the latest events from the GitHub API
- Parses the response using Gson
- Counts occurrences of different event types
- Displays event statistics as a HashMap

## Output Example

```sh
{PushEvent=5, PullRequestEvent=2, IssuesEvent=1}
```

## Notes

- Make sure you have internet access when running the application.
- GitHub may enforce rate limits on API requests if used frequently.

## License

This project is open-source and free to use.

---

Enjoy tracking GitHub activity! 🚀
