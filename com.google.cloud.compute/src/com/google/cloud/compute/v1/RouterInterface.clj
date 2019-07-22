(ns com.google.cloud.compute.v1.RouterInterface
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterInterface]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterInterface`

  returns: `com.google.cloud.compute.v1.RouterInterface$Builder`"
  (^com.google.cloud.compute.v1.RouterInterface$Builder [^com.google.cloud.compute.v1.RouterInterface prototype]
    (RouterInterface/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterInterface$Builder []
    (RouterInterface/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterInterface`"
  (^com.google.cloud.compute.v1.RouterInterface []
    (RouterInterface/getDefaultInstance )))

(defn get-linked-interconnect-attachment
  "URI of the linked Interconnect attachment. It must be in the same region as the router. Each
   interface can have one linked resource, which can be either be a VPN tunnel or an Interconnect
   attachment.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface this]
    (-> this (.getLinkedInterconnectAttachment))))

(defn get-ip-range
  "IP address and range of the interface. The IP range must be in the RFC3927 link-local IP
   address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do
   not truncate the address as it represents the IP address of the interface.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface this]
    (-> this (.getIpRange))))

(defn get-linked-vpn-tunnel
  "URI of the linked VPN tunnel, which must be in the same region as the router. Each interface
   can have one linked resource, which can be either a VPN tunnel or an Interconnect attachment.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface this]
    (-> this (.getLinkedVpnTunnel))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterInterface this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterInterface this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of this interface entry. The name must be 1-63 characters long and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface this]
    (-> this (.getName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterInterface this]
    (-> this (.getApiMessageRequestBody))))

(defn get-management-type
  "[Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is the
   default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface
   that is configured and managed by Cloud Interconnect, specifically, by an
   InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this
   type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface this]
    (-> this (.getManagementType))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterInterface this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterInterface this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterInterface$Builder`"
  (^com.google.cloud.compute.v1.RouterInterface$Builder [^RouterInterface this]
    (-> this (.toBuilder))))

