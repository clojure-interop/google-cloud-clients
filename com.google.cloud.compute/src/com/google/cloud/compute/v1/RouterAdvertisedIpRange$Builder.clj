(ns com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterAdvertisedIpRange$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterAdvertisedIpRange`

  returns: `com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder`"
  (^com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder [^RouterAdvertisedIpRange$Builder this ^com.google.cloud.compute.v1.RouterAdvertisedIpRange other]
    (-> this (.mergeFrom other))))

(defn get-description
  "User-specified description for the IP range.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterAdvertisedIpRange$Builder this]
    (-> this (.getDescription))))

(defn set-description
  "User-specified description for the IP range.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder`"
  (^com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder [^RouterAdvertisedIpRange$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-range
  "The IP range to advertise. The value must be a CIDR-formatted string.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterAdvertisedIpRange$Builder this]
    (-> this (.getRange))))

(defn set-range
  "The IP range to advertise. The value must be a CIDR-formatted string.

  range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder`"
  (^com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder [^RouterAdvertisedIpRange$Builder this ^java.lang.String range]
    (-> this (.setRange range))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterAdvertisedIpRange`"
  (^com.google.cloud.compute.v1.RouterAdvertisedIpRange [^RouterAdvertisedIpRange$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder`"
  (^com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder [^RouterAdvertisedIpRange$Builder this]
    (-> this (.clone))))

