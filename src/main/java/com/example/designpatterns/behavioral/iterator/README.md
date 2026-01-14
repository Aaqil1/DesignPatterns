# Iterator

**Intent:** Provide a way to access elements of an aggregate object sequentially without exposing its underlying representation.

**Problem:** UI, API, and export modules all needed to loop through playlists. Exposing the internal list risked modification and duplication of traversal logic.

**Solution (UML-style text):**
- Iterator: PlaylistIterator with hasNext()/next()
- Concrete Iterator: ListPlaylistIterator
- Aggregate: Playlist creates iterators over its songs
- Client: Main uses the iterator to traverse songs without knowing storage.

**When to use:** You need multiple traversals or want to hide collection details from clients.

**When NOT to use:** Simple internal loops suffice and exposure of the collection is acceptable.

**Pros:** Encapsulates traversal, supports multiple iterator strategies, protects collection.
**Cons:** More classes; can be overkill for small collections.

**30-60 second explanation:** Iterator lets clients play songs without touching the playlist's list. The playlist hands out a PlaylistIterator, so traversal is uniform and internal structure stays hidden.
