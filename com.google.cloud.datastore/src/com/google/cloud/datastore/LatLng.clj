(ns com.google.cloud.datastore.LatLng
  "A Google Cloud Datastore LatLng (represented by latitude and longitude in degrees). This class is
  immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore LatLng]))

(defn *of
  "latitude - `double`
  longitude - `double`

  returns: `com.google.cloud.datastore.LatLng`"
  (^com.google.cloud.datastore.LatLng [^Double latitude ^Double longitude]
    (LatLng/of latitude longitude)))

(defn get-latitude
  "Returns the latitude.

  returns: `double`"
  (^Double [^LatLng this]
    (-> this (.getLatitude))))

(defn get-longitude
  "Returns the longitude.

  returns: `double`"
  (^Double [^LatLng this]
    (-> this (.getLongitude))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LatLng this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LatLng this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LatLng this ^java.lang.Object obj]
    (-> this (.equals obj))))

