(ns com.google.cloud.compute.v1.AccessConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AccessConfig$Builder]))

(defn get-public-ptr-domain-name
  "The DNS domain name for the public PTR record. This field can only be set when the
   set_public_ptr field is enabled.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig$Builder this]
    (-> this (.getPublicPtrDomainName))))

(defn set-nat-ip
  "An external IP address associated with this instance. Specify an unused static external IP
   address available to the project or leave this field undefined to use an IP from a shared
   ephemeral IP address pool. If you specify a static external IP address, it must live in the
   same region as the zone of the instance.

  nat-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig$Builder this ^java.lang.String nat-ip]
    (-> this (.setNatIP nat-ip))))

(defn get-type
  "The type of configuration. The default and only option is ONE_TO_ONE_NAT.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig$Builder this]
    (-> this (.getType))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#accessConfig for access configs.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig$Builder this]
    (-> this (.getKind))))

(defn set-type
  "The type of configuration. The default and only option is ONE_TO_ONE_NAT.

  type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn set-name
  "The name of this access configuration. The default and recommended name is External NAT but
   you can use any arbitrary string you would like. For example, My external IP or Network
   Access.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-set-public-ptr
  "Specifies whether a public DNS ?PTR? record should be created to map the external IP address
   of the instance to a DNS domain name.

  set-public-ptr - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig$Builder this ^java.lang.Boolean set-public-ptr]
    (-> this (.setSetPublicPtr set-public-ptr))))

(defn set-public-ptr-domain-name
  "The DNS domain name for the public PTR record. This field can only be set when the
   set_public_ptr field is enabled.

  public-ptr-domain-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig$Builder this ^java.lang.String public-ptr-domain-name]
    (-> this (.setPublicPtrDomainName public-ptr-domain-name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#accessConfig for access configs.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "The name of this access configuration. The default and recommended name is External NAT but
   you can use any arbitrary string you would like. For example, My external IP or Network
   Access.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig$Builder this]
    (-> this (.getName))))

(defn set-network-tier
  "This signifies the networking tier used for configuring this access configuration and can
   only take the following values: PREMIUM, STANDARD.

   If an AccessConfig is specified without a valid external IP address, an ephemeral IP will
   be created with this networkTier.

   If an AccessConfig with a valid external IP address is specified, it must match that of
   the networkTier associated with the Address resource owning that IP.

  network-tier - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig$Builder this ^java.lang.String network-tier]
    (-> this (.setNetworkTier network-tier))))

(defn build
  "returns: `com.google.cloud.compute.v1.AccessConfig`"
  (^com.google.cloud.compute.v1.AccessConfig [^AccessConfig$Builder this]
    (-> this (.build))))

(defn get-set-public-ptr?
  "Specifies whether a public DNS ?PTR? record should be created to map the external IP address
   of the instance to a DNS domain name.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AccessConfig$Builder this]
    (-> this (.getSetPublicPtr))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AccessConfig`

  returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig$Builder this ^com.google.cloud.compute.v1.AccessConfig other]
    (-> this (.mergeFrom other))))

(defn get-nat-ip
  "An external IP address associated with this instance. Specify an unused static external IP
   address available to the project or leave this field undefined to use an IP from a shared
   ephemeral IP address pool. If you specify a static external IP address, it must live in the
   same region as the zone of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig$Builder this]
    (-> this (.getNatIP))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig$Builder this]
    (-> this (.clone))))

(defn get-network-tier
  "This signifies the networking tier used for configuring this access configuration and can
   only take the following values: PREMIUM, STANDARD.

   If an AccessConfig is specified without a valid external IP address, an ephemeral IP will
   be created with this networkTier.

   If an AccessConfig with a valid external IP address is specified, it must match that of
   the networkTier associated with the Address resource owning that IP.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig$Builder this]
    (-> this (.getNetworkTier))))

