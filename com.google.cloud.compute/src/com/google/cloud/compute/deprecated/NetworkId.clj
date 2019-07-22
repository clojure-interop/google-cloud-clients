(ns com.google.cloud.compute.deprecated.NetworkId
  "Identity for a Google Compute Engine network."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkId]))

(defn *of
  "Returns a new network identity given project and network names. The network name must be 1-63
   characters long and comply with RFC1035. Specifically, the name must match the regular
   expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a
   lowercase letter, and all following characters must be a dash, lowercase letter, or digit,
   except the last character, which cannot be a dash.

  project - `java.lang.String`
  network - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.NetworkId`"
  (^com.google.cloud.compute.deprecated.NetworkId [^java.lang.String project ^java.lang.String network]
    (NetworkId/of project network))
  (^com.google.cloud.compute.deprecated.NetworkId [^java.lang.String network]
    (NetworkId/of network)))

(defn get-network
  "Returns the name of the network. The network name must be 1-63 characters long and comply with
   RFC1035. Specifically, the name must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a lowercase letter, and all
   following characters must be a dash, lowercase letter, or digit, except the last character,
   which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkId this]
    (-> this (.getNetwork))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkId this ^java.lang.Object obj]
    (-> this (.equals obj))))

