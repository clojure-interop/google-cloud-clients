(ns com.google.cloud.storage.contrib.nio.SeekableByteChannelPrefetcher$Statistics
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio SeekableByteChannelPrefetcher$Statistics]))

(defn ms-waiting-for-data
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-msWaitingForData)))

(defn ms-copying-data
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-msCopyingData)))

(defn bytes-returned
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-bytesReturned)))

(defn bytes-read
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-bytesRead)))

(defn ms-between-calls-to-read
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-msBetweenCallsToRead)))

(defn nb-hit
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-nbHit)))

(defn nb-near-hit
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-nbNearHit)))

(defn nb-miss
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-nbMiss)))

(defn nb-going-back
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-nbGoingBack)))

(defn nb-reads-past-end
  "Instance Constant.

  type: long"
  (^Long [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this .-nbReadsPastEnd)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SeekableByteChannelPrefetcher$Statistics this]
    (-> this (.toString))))

