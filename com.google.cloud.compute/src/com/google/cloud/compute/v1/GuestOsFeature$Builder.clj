(ns com.google.cloud.compute.v1.GuestOsFeature$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GuestOsFeature$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.GuestOsFeature`

  returns: `com.google.cloud.compute.v1.GuestOsFeature$Builder`"
  (^com.google.cloud.compute.v1.GuestOsFeature$Builder [^GuestOsFeature$Builder this ^com.google.cloud.compute.v1.GuestOsFeature other]
    (-> this (.mergeFrom other))))

(defn get-type
  "The ID of a supported feature. Read Enabling guest operating system features to see a list of
   available options.

  returns: `java.lang.String`"
  (^java.lang.String [^GuestOsFeature$Builder this]
    (-> this (.getType))))

(defn set-type
  "The ID of a supported feature. Read Enabling guest operating system features to see a list of
   available options.

  type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GuestOsFeature$Builder`"
  (^com.google.cloud.compute.v1.GuestOsFeature$Builder [^GuestOsFeature$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn build
  "returns: `com.google.cloud.compute.v1.GuestOsFeature`"
  (^com.google.cloud.compute.v1.GuestOsFeature [^GuestOsFeature$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.GuestOsFeature$Builder`"
  (^com.google.cloud.compute.v1.GuestOsFeature$Builder [^GuestOsFeature$Builder this]
    (-> this (.clone))))

