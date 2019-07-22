(ns com.google.cloud.datastore.LatLngValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore LatLngValue]))

(defn ->lat-lng-value
  "Constructor.

  value - `com.google.cloud.datastore.LatLng`"
  (^LatLngValue [^com.google.cloud.datastore.LatLng value]
    (new LatLngValue value)))

(defn *of
  "value - `com.google.cloud.datastore.LatLng`

  returns: `com.google.cloud.datastore.LatLngValue`"
  (^com.google.cloud.datastore.LatLngValue [^com.google.cloud.datastore.LatLng value]
    (LatLngValue/of value)))

(defn *new-builder
  "value - `com.google.cloud.datastore.LatLng`

  returns: `com.google.cloud.datastore.LatLngValue$Builder`"
  (^com.google.cloud.datastore.LatLngValue$Builder [^com.google.cloud.datastore.LatLng value]
    (LatLngValue/newBuilder value)))

(defn to-builder
  "returns: `com.google.cloud.datastore.LatLngValue$Builder`"
  (^com.google.cloud.datastore.LatLngValue$Builder [^LatLngValue this]
    (-> this (.toBuilder))))

