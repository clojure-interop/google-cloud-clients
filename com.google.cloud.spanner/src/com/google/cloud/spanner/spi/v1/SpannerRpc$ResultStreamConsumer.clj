(ns com.google.cloud.spanner.spi.v1.SpannerRpc$ResultStreamConsumer
  "Consumer for the results produced by a streaming read or query call."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.spi.v1 SpannerRpc$ResultStreamConsumer]))

(defn on-partial-result-set
  "results - `com.google.spanner.v1.PartialResultSet`"
  ([^SpannerRpc$ResultStreamConsumer this ^com.google.spanner.v1.PartialResultSet results]
    (-> this (.onPartialResultSet results))))

(defn on-completed
  ""
  ([^SpannerRpc$ResultStreamConsumer this]
    (-> this (.onCompleted))))

(defn on-error
  "e - `com.google.cloud.spanner.SpannerException`"
  ([^SpannerRpc$ResultStreamConsumer this ^com.google.cloud.spanner.SpannerException e]
    (-> this (.onError e))))

