(ns com.google.cloud.compute.v1.TargetHttpProxy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpProxy$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#targetHttpProxy for target HTTP proxies.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy$Builder this]
    (-> this (.getKind))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#targetHttpProxy for target HTTP proxies.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-url-map
  "URL to the UrlMap resource that defines the mapping from URL to the BackendService.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy$Builder this]
    (-> this (.getUrlMap))))

(defn set-url-map
  "URL to the UrlMap resource that defines the mapping from URL to the BackendService.

  url-map - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy$Builder this ^java.lang.String url-map]
    (-> this (.setUrlMap url-map))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetHttpProxy`"
  (^com.google.cloud.compute.v1.TargetHttpProxy [^TargetHttpProxy$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetHttpProxy`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy$Builder this ^com.google.cloud.compute.v1.TargetHttpProxy other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy$Builder this]
    (-> this (.getCreationTimestamp))))

