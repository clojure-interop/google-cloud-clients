(ns com.google.cloud.compute.v1.TargetHttpsProxy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpsProxy$Builder]))

(defn set-ssl-policy
  "URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not
   set, the TargetHttpsProxy resource will not have any SSL policy configured.

  ssl-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String ssl-policy]
    (-> this (.setSslPolicy ssl-policy))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-ssl-policy
  "URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not
   set, the TargetHttpsProxy resource will not have any SSL policy configured.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy$Builder this]
    (-> this (.getSslPolicy))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy$Builder this]
    (-> this (.getKind))))

(defn get-quic-override
  "Specifies the QUIC override policy for this TargetHttpsProxy resource. This determines
   whether the load balancer will attempt to negotiate QUIC with clients or not. Can specify one
   of NONE, ENABLE, or DISABLE. Specify ENABLE to always enable QUIC, Enables QUIC when set to
   ENABLE, and disables QUIC when set to DISABLE. If NONE is specified, uses the QUIC policy
   with no user overrides, which is equivalent to DISABLE. Not specifying this field is
   equivalent to specifying NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy$Builder this]
    (-> this (.getQuicOverride))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-url-map
  "A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from
   URL to the BackendService. For example, the following are all valid URLs for specifying a URL
   map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map -
   projects/project/global/urlMaps/url-map - global/urlMaps/url-map

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy$Builder this]
    (-> this (.getUrlMap))))

(defn set-url-map
  "A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from
   URL to the BackendService. For example, the following are all valid URLs for specifying a URL
   map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map -
   projects/project/global/urlMaps/url-map - global/urlMaps/url-map

  url-map - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String url-map]
    (-> this (.setUrlMap url-map))))

(defn set-quic-override
  "Specifies the QUIC override policy for this TargetHttpsProxy resource. This determines
   whether the load balancer will attempt to negotiate QUIC with clients or not. Can specify one
   of NONE, ENABLE, or DISABLE. Specify ENABLE to always enable QUIC, Enables QUIC when set to
   ENABLE, and disables QUIC when set to DISABLE. If NONE is specified, uses the QUIC policy
   with no user overrides, which is equivalent to DISABLE. Not specifying this field is
   equivalent to specifying NONE.

  quic-override - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String quic-override]
    (-> this (.setQuicOverride quic-override))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxy`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy [^TargetHttpsProxy$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn get-ssl-certificates-list
  "URLs to SslCertificate resources that are used to authenticate connections between users and
   the load balancer. At least one SSL certificate must be specified. Currently, you may specify
   up to 15 SSL certificates.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetHttpsProxy$Builder this]
    (-> this (.getSslCertificatesList))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetHttpsProxy`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^com.google.cloud.compute.v1.TargetHttpsProxy other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy$Builder this]
    (-> this (.getCreationTimestamp))))

(defn add-all-ssl-certificates
  "URLs to SslCertificate resources that are used to authenticate connections between users and
   the load balancer. At least one SSL certificate must be specified. Currently, you may specify
   up to 15 SSL certificates.

  ssl-certificates - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.util.List ssl-certificates]
    (-> this (.addAllSslCertificates ssl-certificates))))

(defn add-ssl-certificates
  "URLs to SslCertificate resources that are used to authenticate connections between users and
   the load balancer. At least one SSL certificate must be specified. Currently, you may specify
   up to 15 SSL certificates.

  ssl-certificates - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy$Builder this ^java.lang.String ssl-certificates]
    (-> this (.addSslCertificates ssl-certificates))))

