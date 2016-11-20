# Scoreboard Chat Hack for Bukkit

This is a simple chat layer which reenables Vanilla-style chat in relation to scoreboards. This would mean any sort of coloration or any other modifications to a username that would appear in chat, and is necessary as Bukkit does not support simple chat for this modification.

### Installation

Just put the jar in the plugins folder. There's no config.yml for this.

### Caveats

This is not compatible with any other message adjustment plugins for Bukkit currently, but will be in a future version.

### Known Bugs

1. When a player frequently uses chat such that they send messages close enough together that the server does not process the first message before the second arrives, the second message will appear without a username. This is believed to be an issue with Bukkit.
2. If a username coloration does not end with a "reset" attribute, the rest of the message will be colored. This will be fixed soon.

## License

ScoreboardChatHack is distributed under WTFPL <a href="http://www.wtfpl.net/"><img src="http://www.wtfpl.net/wp-content/uploads/2012/12/wtfpl-badge-4.png" width="80" height="15" alt="WTFPL" /></a>.