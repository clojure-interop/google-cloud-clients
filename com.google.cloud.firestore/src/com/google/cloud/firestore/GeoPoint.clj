(ns com.google.cloud.firestore.GeoPoint
  "Immutable class representing a geographic location in Firestore"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore GeoPoint]))

(defn ->geo-point
  "Constructor.

  Construct a new GeoPoint using the provided latitude and longitude values.

  latitude - The latitude of this GeoPoint in the range [-90, 90]. - `double`
  longitude - The longitude of this GeoPoint in the range [-180, 180]. - `double`"
  (^GeoPoint [^Double latitude ^Double longitude]
    (new GeoPoint latitude longitude)))

(defn get-latitude
  "Returns the latitude.

  returns: The latitude value of this GeoPoint. - `double`"
  (^Double [^GeoPoint this]
    (-> this (.getLatitude))))

(defn get-longitude
  "Returns the longitude.

  returns: The longitude value of this GeoPoint. - `double`"
  (^Double [^GeoPoint this]
    (-> this (.getLongitude))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GeoPoint this]
    (-> this (.toString))))

(defn equals
  "Returns true if this GeoPoint is equal to the provided object.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this GeoPoint is equal to the provided object. - `boolean`"
  (^Boolean [^GeoPoint this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GeoPoint this]
    (-> this (.hashCode))))

