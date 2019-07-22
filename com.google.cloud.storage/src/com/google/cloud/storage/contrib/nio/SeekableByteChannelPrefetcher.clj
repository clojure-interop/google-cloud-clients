(ns com.google.cloud.storage.contrib.nio.SeekableByteChannelPrefetcher
  "SeekableByteChannelPrefetcher wraps an existing SeekableByteChannel to add prefetching. The
  prefetching is done on a different thread, so you can write simple code that repeatedly calls
  read() to get data, processes it, and then calls read again -- and yet this simple code overlaps
  computation and communication for you. (Of course this is only worthwhile if the underlying
  SeekableByteChannel doesn't already implement prefetching)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio SeekableByteChannelPrefetcher]))

(defn *add-prefetcher
  "Wraps the provided SeekableByteChannel within a SeekableByteChannelPrefetcher, using the
   provided buffer size

  buffer-size-mb - buffer size in MB - `int`
  channel - channel to wrap in the prefetcher - `java.nio.channels.SeekableByteChannel`

  returns: wrapped channel - `java.nio.channels.SeekableByteChannel`

  throws: java.io.IOException"
  (^java.nio.channels.SeekableByteChannel [^Integer buffer-size-mb ^java.nio.channels.SeekableByteChannel channel]
    (SeekableByteChannelPrefetcher/addPrefetcher buffer-size-mb channel)))

(defn fetch
  "position - `long`

  returns: `java.nio.ByteBuffer`

  throws: java.lang.InterruptedException"
  (^java.nio.ByteBuffer [^SeekableByteChannelPrefetcher this ^Long position]
    (-> this (.fetch position))))

(defn read
  "Reads a sequence of bytes from this channel into the given buffer.

   Bytes are read starting at this channel's current position, and then the position is updated
   with the number of bytes actually read. Otherwise this method behaves exactly as specified in
   the ReadableByteChannel interface.

  dst - buffer to write into - `java.nio.ByteBuffer`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^SeekableByteChannelPrefetcher this ^java.nio.ByteBuffer dst]
    (-> this (.read dst))))

(defn position
  "Sets this channel's position.



   Setting the position to a value that is greater than the current size is legal but does not
   change the size of the entity. A later attempt to read bytes at such a position will
   immediately return an end-of-file indication. A later attempt to write bytes at such a position
   will cause the entity to grow to accommodate the new bytes; the values of any bytes between the
   previous end-of-file and the newly-written bytes are unspecified.

   Setting the channel's position is not recommended when connected to an entity, typically a
   file, that is opened with the APPEND option.
   When opened for append, the position is first advanced to the end before writing.

  new-position - The new position, a non-negative integer counting the number of bytes from the beginning of the entity - `long`

  returns: This channel - `java.nio.channels.SeekableByteChannel`

  throws: java.nio.channels.ClosedChannelException - If this channel is closed"
  (^java.nio.channels.SeekableByteChannel [^SeekableByteChannelPrefetcher this ^Long new-position]
    (-> this (.position new-position)))
  (^Long [^SeekableByteChannelPrefetcher this]
    (-> this (.position))))

(defn get-statistics
  "returns: `com.google.cloud.storage.contrib.nio.SeekableByteChannelPrefetcher$Statistics`"
  (^com.google.cloud.storage.contrib.nio.SeekableByteChannelPrefetcher$Statistics [^SeekableByteChannelPrefetcher this]
    (-> this (.getStatistics))))

(defn truncate
  "Not supported.

  size - `long`

  returns: `java.nio.channels.SeekableByteChannel`

  throws: java.io.IOException"
  (^java.nio.channels.SeekableByteChannel [^SeekableByteChannelPrefetcher this ^Long size]
    (-> this (.truncate size))))

(defn close
  "Closes this channel.



   After a channel is closed, any further attempt to invoke I/O operations upon it will cause a
   ClosedChannelException to be thrown.



   If this channel is already closed then invoking this method has no effect.



   This method may be invoked at any time. If some other thread has already invoked it,
   however, then another invocation will block until the first invocation is complete, after which
   it will return without effect.

  throws: java.io.IOException - If an I/O error occurs"
  ([^SeekableByteChannelPrefetcher this]
    (-> this (.close))))

(defn size
  "Returns the current size of entity to which this channel is connected.

  returns: The current size, measured in bytes - `long`

  throws: java.nio.channels.ClosedChannelException - If this channel is closed"
  (^Long [^SeekableByteChannelPrefetcher this]
    (-> this (.size))))

(defn open?
  "Tells whether or not this channel is open.

  returns: true if, and only if, this channel is open - `boolean`"
  (^Boolean [^SeekableByteChannelPrefetcher this]
    (-> this (.isOpen))))

(defn write
  "Writing isn't supported.

  src - `java.nio.ByteBuffer`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^SeekableByteChannelPrefetcher this ^java.nio.ByteBuffer src]
    (-> this (.write src))))

