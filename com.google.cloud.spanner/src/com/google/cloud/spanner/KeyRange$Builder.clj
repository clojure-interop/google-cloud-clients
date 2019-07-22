(ns com.google.cloud.spanner.KeyRange$Builder
  "Builder for KeyRange instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner KeyRange$Builder]))

(defn set-start
  "Sets the start key of the range. This must be set before build() is called.

  key - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeyRange$Builder`"
  (^com.google.cloud.spanner.KeyRange$Builder [^KeyRange$Builder this ^com.google.cloud.spanner.Key key]
    (-> this (.setStart key))))

(defn set-start-type
  "Sets whether the start key is inclusive (CLOSED) or exclusive (OPEN). The
   default is CLOSED.

  type - `com.google.cloud.spanner.KeyRange$Endpoint`

  returns: `com.google.cloud.spanner.KeyRange$Builder`"
  (^com.google.cloud.spanner.KeyRange$Builder [^KeyRange$Builder this ^com.google.cloud.spanner.KeyRange$Endpoint type]
    (-> this (.setStartType type))))

(defn set-end
  "Sets the end key of the range. This must be set before build() is called.

  key - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeyRange$Builder`"
  (^com.google.cloud.spanner.KeyRange$Builder [^KeyRange$Builder this ^com.google.cloud.spanner.Key key]
    (-> this (.setEnd key))))

(defn set-end-type
  "Sets whether the end key is inclusive (CLOSED) or exclusive (OPEN). The
   default is OPEN.

  type - `com.google.cloud.spanner.KeyRange$Endpoint`

  returns: `com.google.cloud.spanner.KeyRange$Builder`"
  (^com.google.cloud.spanner.KeyRange$Builder [^KeyRange$Builder this ^com.google.cloud.spanner.KeyRange$Endpoint type]
    (-> this (.setEndType type))))

(defn build
  "returns: `com.google.cloud.spanner.KeyRange`"
  (^com.google.cloud.spanner.KeyRange [^KeyRange$Builder this]
    (-> this (.build))))

