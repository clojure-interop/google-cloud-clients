(ns com.google.cloud.compute.v1.HostRule$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HostRule$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HostRule$Builder`"
  (^com.google.cloud.compute.v1.HostRule$Builder [^HostRule$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn add-hosts
  "The list of host patterns to match. They must be valid hostnames, except * will match any
   string of ([a-z0-9-.]*). In that case, * must be the first character and must be
   followed in the pattern by either - or ..

  hosts - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HostRule$Builder`"
  (^com.google.cloud.compute.v1.HostRule$Builder [^HostRule$Builder this ^java.lang.String hosts]
    (-> this (.addHosts hosts))))

(defn get-hosts-list
  "The list of host patterns to match. They must be valid hostnames, except * will match any
   string of ([a-z0-9-.]*). In that case, * must be the first character and must be
   followed in the pattern by either - or ..

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HostRule$Builder this]
    (-> this (.getHostsList))))

(defn get-path-matcher
  "The name of the PathMatcher to use to match the path portion of the URL if the hostRule
   matches the URL's host portion.

  returns: `java.lang.String`"
  (^java.lang.String [^HostRule$Builder this]
    (-> this (.getPathMatcher))))

(defn build
  "returns: `com.google.cloud.compute.v1.HostRule`"
  (^com.google.cloud.compute.v1.HostRule [^HostRule$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HostRule$Builder this]
    (-> this (.getDescription))))

(defn set-path-matcher
  "The name of the PathMatcher to use to match the path portion of the URL if the hostRule
   matches the URL's host portion.

  path-matcher - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HostRule$Builder`"
  (^com.google.cloud.compute.v1.HostRule$Builder [^HostRule$Builder this ^java.lang.String path-matcher]
    (-> this (.setPathMatcher path-matcher))))

(defn add-all-hosts
  "The list of host patterns to match. They must be valid hostnames, except * will match any
   string of ([a-z0-9-.]*). In that case, * must be the first character and must be
   followed in the pattern by either - or ..

  hosts - `java.util.List`

  returns: `com.google.cloud.compute.v1.HostRule$Builder`"
  (^com.google.cloud.compute.v1.HostRule$Builder [^HostRule$Builder this ^java.util.List hosts]
    (-> this (.addAllHosts hosts))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.HostRule`

  returns: `com.google.cloud.compute.v1.HostRule$Builder`"
  (^com.google.cloud.compute.v1.HostRule$Builder [^HostRule$Builder this ^com.google.cloud.compute.v1.HostRule other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.HostRule$Builder`"
  (^com.google.cloud.compute.v1.HostRule$Builder [^HostRule$Builder this]
    (-> this (.clone))))

