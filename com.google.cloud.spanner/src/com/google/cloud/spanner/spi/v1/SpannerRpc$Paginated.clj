(ns com.google.cloud.spanner.spi.v1.SpannerRpc$Paginated
  "Represents results from paginated RPCs, i.e., those where up to a maximum number of items is
  returned from each call and a followup call must be made to fetch more."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.spi.v1 SpannerRpc$Paginated]))

(defn ->paginated
  "Constructor.

  Creates a new page of results.

  results - the result, or null for no results. - `java.lang.Iterable`
  next-page-token - the token for the next page of results, or null if no more pages exist - `java.lang.String`"
  (^SpannerRpc$Paginated [^java.lang.Iterable results ^java.lang.String next-page-token]
    (new SpannerRpc$Paginated results next-page-token)))

(defn get-results
  "Returns the current page of results. Always returns non-null; if a null \"results\" was passed
   to the constructor, a default empty Iterable will be returned.

  returns: `java.lang.Iterable<T>`"
  (^java.lang.Iterable [^SpannerRpc$Paginated this]
    (-> this (.getResults))))

(defn get-next-page-token
  "Returns the token to use in the request for the next page, or null if this is the last page.

  returns: `java.lang.String`"
  (^java.lang.String [^SpannerRpc$Paginated this]
    (-> this (.getNextPageToken))))

