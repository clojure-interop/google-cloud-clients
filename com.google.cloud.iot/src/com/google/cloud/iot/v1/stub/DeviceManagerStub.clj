(ns com.google.cloud.iot.v1.stub.DeviceManagerStub
  "Base stub class for Cloud IoT API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iot.v1.stub DeviceManagerStub]))

(defn ->device-manager-stub
  "Constructor."
  (^DeviceManagerStub []
    (new DeviceManagerStub )))

(defn bind-device-to-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.BindDeviceToGatewayRequest,com.google.cloud.iot.v1.BindDeviceToGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.bindDeviceToGatewayCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.getIamPolicyCallable))))

(defn list-device-states-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceStatesRequest,com.google.cloud.iot.v1.ListDeviceStatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.listDeviceStatesCallable))))

(defn create-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.CreateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.createDeviceCallable))))

(defn list-devices-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDevicesRequest,com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.listDevicesPagedCallable))))

(defn list-device-registries-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceRegistriesRequest,com.google.cloud.iot.v1.ListDeviceRegistriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.listDeviceRegistriesCallable))))

(defn delete-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.DeleteDeviceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.deleteDeviceCallable))))

(defn send-command-to-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.SendCommandToDeviceRequest,com.google.cloud.iot.v1.SendCommandToDeviceResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.sendCommandToDeviceCallable))))

(defn list-device-registries-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceRegistriesRequest,com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.listDeviceRegistriesPagedCallable))))

(defn unbind-device-from-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.UnbindDeviceFromGatewayRequest,com.google.cloud.iot.v1.UnbindDeviceFromGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.unbindDeviceFromGatewayCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.setIamPolicyCallable))))

(defn list-device-config-versions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceConfigVersionsRequest,com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.listDeviceConfigVersionsCallable))))

(defn close
  ""
  ([^DeviceManagerStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.testIamPermissionsCallable))))

(defn get-device-registry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.GetDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.getDeviceRegistryCallable))))

(defn list-devices-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDevicesRequest,com.google.cloud.iot.v1.ListDevicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.listDevicesCallable))))

(defn get-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.GetDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.getDeviceCallable))))

(defn update-device-registry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.UpdateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.updateDeviceRegistryCallable))))

(defn modify-cloud-to-device-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ModifyCloudToDeviceConfigRequest,com.google.cloud.iot.v1.DeviceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.modifyCloudToDeviceConfigCallable))))

(defn create-device-registry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.CreateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.createDeviceRegistryCallable))))

(defn delete-device-registry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.DeleteDeviceRegistryRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.deleteDeviceRegistryCallable))))

(defn update-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.UpdateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerStub this]
    (-> this (.updateDeviceCallable))))

