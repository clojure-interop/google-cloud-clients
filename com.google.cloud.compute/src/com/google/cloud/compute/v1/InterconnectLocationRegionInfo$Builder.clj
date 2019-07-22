(ns com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectLocationRegionInfo$Builder]))

(defn set-region
  "URL for the region of this location.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder [^InterconnectLocationRegionInfo$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn get-expected-rtt-ms
  "Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this
   region.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationRegionInfo$Builder this]
    (-> this (.getExpectedRttMs))))

(defn get-location-presence
  "Identifies the network presence of this location.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationRegionInfo$Builder this]
    (-> this (.getLocationPresence))))

(defn set-location-presence
  "Identifies the network presence of this location.

  location-presence - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder [^InterconnectLocationRegionInfo$Builder this ^java.lang.String location-presence]
    (-> this (.setLocationPresence location-presence))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectLocationRegionInfo`"
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo [^InterconnectLocationRegionInfo$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectLocationRegionInfo`

  returns: `com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder [^InterconnectLocationRegionInfo$Builder this ^com.google.cloud.compute.v1.InterconnectLocationRegionInfo other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder [^InterconnectLocationRegionInfo$Builder this]
    (-> this (.clone))))

(defn set-expected-rtt-ms
  "Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this
   region.

  expected-rtt-ms - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder [^InterconnectLocationRegionInfo$Builder this ^java.lang.String expected-rtt-ms]
    (-> this (.setExpectedRttMs expected-rtt-ms))))

(defn get-region
  "URL for the region of this location.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationRegionInfo$Builder this]
    (-> this (.getRegion))))

