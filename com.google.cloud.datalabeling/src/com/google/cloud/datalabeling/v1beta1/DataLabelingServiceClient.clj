(ns com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient
  "Service Description:

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
    String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
    Dataset dataset = Dataset.newBuilder().build();
    Dataset response = dataLabelingServiceClient.createDataset(formattedParent, dataset);
  }

  Note: close() needs to be called on the dataLabelingServiceClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of DataLabelingServiceSettings to
  create(). For example:

  To customize credentials:



  DataLabelingServiceSettings dataLabelingServiceSettings =
      DataLabelingServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  DataLabelingServiceClient dataLabelingServiceClient =
      DataLabelingServiceClient.create(dataLabelingServiceSettings);

  To customize the endpoint:



  DataLabelingServiceSettings dataLabelingServiceSettings =
      DataLabelingServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  DataLabelingServiceClient dataLabelingServiceClient =
      DataLabelingServiceClient.create(dataLabelingServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1 DataLabelingServiceClient]))

(defn *parse-project-from-data-item-name
  "Deprecated. Use the DataItemName class instead.

  data-item-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String data-item-name]
    (DataLabelingServiceClient/parseProjectFromDataItemName data-item-name)))

(defn *format-example-name
  "Deprecated. Use the ExampleName class instead.

  project - `java.lang.String`
  dataset - `java.lang.String`
  annotated-dataset - `java.lang.String`
  example - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String dataset ^java.lang.String annotated-dataset ^java.lang.String example]
    (DataLabelingServiceClient/formatExampleName project dataset annotated-dataset example)))

(defn *parse-project-from-annotated-dataset-name
  "Deprecated. Use the AnnotatedDatasetName class instead.

  annotated-dataset-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String annotated-dataset-name]
    (DataLabelingServiceClient/parseProjectFromAnnotatedDatasetName annotated-dataset-name)))

(defn *parse-project-from-annotation-spec-set-name
  "Deprecated. Use the AnnotationSpecSetName class instead.

  annotation-spec-set-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String annotation-spec-set-name]
    (DataLabelingServiceClient/parseProjectFromAnnotationSpecSetName annotation-spec-set-name)))

(defn *parse-dataset-from-evaluation-name
  "Deprecated. Use the EvaluationName class instead.

  evaluation-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String evaluation-name]
    (DataLabelingServiceClient/parseDatasetFromEvaluationName evaluation-name)))

(defn *format-annotated-dataset-name
  "Deprecated. Use the AnnotatedDatasetName class instead.

  project - `java.lang.String`
  dataset - `java.lang.String`
  annotated-dataset - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String dataset ^java.lang.String annotated-dataset]
    (DataLabelingServiceClient/formatAnnotatedDatasetName project dataset annotated-dataset)))

(defn *format-data-item-name
  "Deprecated. Use the DataItemName class instead.

  project - `java.lang.String`
  dataset - `java.lang.String`
  data-item - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String dataset ^java.lang.String data-item]
    (DataLabelingServiceClient/formatDataItemName project dataset data-item)))

(defn *parse-project-from-evaluation-name
  "Deprecated. Use the EvaluationName class instead.

  evaluation-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String evaluation-name]
    (DataLabelingServiceClient/parseProjectFromEvaluationName evaluation-name)))

(defn *parse-project-from-evaluation-job-name
  "Deprecated. Use the EvaluationJobName class instead.

  evaluation-job-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String evaluation-job-name]
    (DataLabelingServiceClient/parseProjectFromEvaluationJobName evaluation-job-name)))

(defn *parse-project-from-project-name
  "Deprecated. Use the ProjectName class instead.

  project-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project-name]
    (DataLabelingServiceClient/parseProjectFromProjectName project-name)))

(defn *parse-dataset-from-example-name
  "Deprecated. Use the ExampleName class instead.

  example-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String example-name]
    (DataLabelingServiceClient/parseDatasetFromExampleName example-name)))

(defn *parse-dataset-from-dataset-name
  "Deprecated. Use the DatasetName class instead.

  dataset-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String dataset-name]
    (DataLabelingServiceClient/parseDatasetFromDatasetName dataset-name)))

(defn *parse-data-item-from-data-item-name
  "Deprecated. Use the DataItemName class instead.

  data-item-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String data-item-name]
    (DataLabelingServiceClient/parseDataItemFromDataItemName data-item-name)))

(defn *parse-project-from-instruction-name
  "Deprecated. Use the InstructionName class instead.

  instruction-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String instruction-name]
    (DataLabelingServiceClient/parseProjectFromInstructionName instruction-name)))

(defn *format-project-name
  "Deprecated. Use the ProjectName class instead.

  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project]
    (DataLabelingServiceClient/formatProjectName project)))

(defn *parse-annotated-dataset-from-example-name
  "Deprecated. Use the ExampleName class instead.

  example-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String example-name]
    (DataLabelingServiceClient/parseAnnotatedDatasetFromExampleName example-name)))

(defn *parse-dataset-from-data-item-name
  "Deprecated. Use the DataItemName class instead.

  data-item-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String data-item-name]
    (DataLabelingServiceClient/parseDatasetFromDataItemName data-item-name)))

(defn *parse-project-from-example-name
  "Deprecated. Use the ExampleName class instead.

  example-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String example-name]
    (DataLabelingServiceClient/parseProjectFromExampleName example-name)))

(defn *parse-annotated-dataset-from-annotated-dataset-name
  "Deprecated. Use the AnnotatedDatasetName class instead.

  annotated-dataset-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String annotated-dataset-name]
    (DataLabelingServiceClient/parseAnnotatedDatasetFromAnnotatedDatasetName annotated-dataset-name)))

(defn *format-evaluation-name
  "Deprecated. Use the EvaluationName class instead.

  project - `java.lang.String`
  dataset - `java.lang.String`
  evaluation - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String dataset ^java.lang.String evaluation]
    (DataLabelingServiceClient/formatEvaluationName project dataset evaluation)))

(defn *parse-example-from-example-name
  "Deprecated. Use the ExampleName class instead.

  example-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String example-name]
    (DataLabelingServiceClient/parseExampleFromExampleName example-name)))

(defn *format-evaluation-job-name
  "Deprecated. Use the EvaluationJobName class instead.

  project - `java.lang.String`
  evaluation-job - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String evaluation-job]
    (DataLabelingServiceClient/formatEvaluationJobName project evaluation-job)))

(defn *create
  "Constructs an instance of DataLabelingServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient [^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings settings]
    (DataLabelingServiceClient/create settings))
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient []
    (DataLabelingServiceClient/create )))

(defn *format-dataset-name
  "Deprecated. Use the DatasetName class instead.

  project - `java.lang.String`
  dataset - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String dataset]
    (DataLabelingServiceClient/formatDatasetName project dataset)))

(defn *parse-project-from-dataset-name
  "Deprecated. Use the DatasetName class instead.

  dataset-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String dataset-name]
    (DataLabelingServiceClient/parseProjectFromDatasetName dataset-name)))

(defn *format-instruction-name
  "Deprecated. Use the InstructionName class instead.

  project - `java.lang.String`
  instruction - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String instruction]
    (DataLabelingServiceClient/formatInstructionName project instruction)))

(defn *parse-dataset-from-annotated-dataset-name
  "Deprecated. Use the AnnotatedDatasetName class instead.

  annotated-dataset-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String annotated-dataset-name]
    (DataLabelingServiceClient/parseDatasetFromAnnotatedDatasetName annotated-dataset-name)))

(defn *parse-instruction-from-instruction-name
  "Deprecated. Use the InstructionName class instead.

  instruction-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String instruction-name]
    (DataLabelingServiceClient/parseInstructionFromInstructionName instruction-name)))

(defn *parse-evaluation-job-from-evaluation-job-name
  "Deprecated. Use the EvaluationJobName class instead.

  evaluation-job-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String evaluation-job-name]
    (DataLabelingServiceClient/parseEvaluationJobFromEvaluationJobName evaluation-job-name)))

(defn *parse-annotation-spec-set-from-annotation-spec-set-name
  "Deprecated. Use the AnnotationSpecSetName class instead.

  annotation-spec-set-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String annotation-spec-set-name]
    (DataLabelingServiceClient/parseAnnotationSpecSetFromAnnotationSpecSetName annotation-spec-set-name)))

(defn *parse-evaluation-from-evaluation-name
  "Deprecated. Use the EvaluationName class instead.

  evaluation-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String evaluation-name]
    (DataLabelingServiceClient/parseEvaluationFromEvaluationName evaluation-name)))

(defn *format-annotation-spec-set-name
  "Deprecated. Use the AnnotationSpecSetName class instead.

  project - `java.lang.String`
  annotation-spec-set - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String annotation-spec-set]
    (DataLabelingServiceClient/formatAnnotationSpecSetName project annotation-spec-set)))

(defn pause-evaluation-job
  "Pauses an evaluation job. Pausing a evaluation job that is already in PAUSED state will be a
   no-op.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationJobName(\"[PROJECT]\", \"[EVALUATION_JOB]\");
     dataLabelingServiceClient.pauseEvaluationJob(formattedName);
   }

  name - Required. Name of the evaluation job that is going to be paused. Format: 'projects/{project_id}/evaluationJobs/{evaluation_job_id}' - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.pauseEvaluationJob name))))

(defn list-evaluation-jobs-callable
  "Lists all evaluation jobs within a project with possible filters. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     String filter = \"\";
     ListEvaluationJobsRequest request = ListEvaluationJobsRequest.newBuilder()
       .setParent(formattedParent)
       .setFilter(filter)
       .build();
     while (true) {
       ListEvaluationJobsResponse response = dataLabelingServiceClient.listEvaluationJobsCallable().call(request);
       for (EvaluationJob element : response.getEvaluationJobsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listEvaluationJobsCallable))))

(defn pause-evaluation-job-callable
  "Pauses an evaluation job. Pausing a evaluation job that is already in PAUSED state will be a
   no-op.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationJobName(\"[PROJECT]\", \"[EVALUATION_JOB]\");
     PauseEvaluationJobRequest request = PauseEvaluationJobRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Void> future = dataLabelingServiceClient.pauseEvaluationJobCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.pauseEvaluationJobCallable))))

(defn list-annotation-spec-sets-paged-callable
  "Lists annotation spec sets for a project. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     ListAnnotationSpecSetsRequest request = ListAnnotationSpecSetsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListAnnotationSpecSetsPagedResponse> future = dataLabelingServiceClient.listAnnotationSpecSetsPagedCallable().futureCall(request);
     // Do something
     for (AnnotationSpecSet element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listAnnotationSpecSetsPagedCallable))))

(defn create-dataset
  "Creates dataset. If success return a Dataset resource.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     Dataset dataset = Dataset.newBuilder().build();
     Dataset response = dataLabelingServiceClient.createDataset(formattedParent, dataset);
   }

  parent - Required. Dataset resource parent, format: projects/{project_id} - `java.lang.String`
  dataset - Required. The dataset to be created. - `com.google.cloud.datalabeling.v1beta1.Dataset`

  returns: `com.google.cloud.datalabeling.v1beta1.Dataset`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.Dataset [^DataLabelingServiceClient this ^java.lang.String parent ^com.google.cloud.datalabeling.v1beta1.Dataset dataset]
    (-> this (.createDataset parent dataset)))
  (^com.google.cloud.datalabeling.v1beta1.Dataset [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest request]
    (-> this (.createDataset request))))

(defn search-evaluations
  "Searchs evaluations within a project. Supported filter: evaluation_job, evaluation_time.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     String filter = \"\";
     for (Evaluation element : dataLabelingServiceClient.searchEvaluations(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Evaluation search parent. Format: projects/{project_id} - `java.lang.String`
  filter - Optional. Support filtering by model id, job state, start and end time. Format: \"evaluation_job.evaluation_job_id = {evaluation_job_id} AND evaluation_job.evaluation_job_run_time_start = {timestamp} AND evaluation_job.evaluation_job_run_time_end = {timestamp} AND annotation_spec.display_name = {display_name}\" - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPagedResponse [^DataLabelingServiceClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.searchEvaluations parent filter)))
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPagedResponse [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest request]
    (-> this (.searchEvaluations request))))

(defn get-dataset-callable
  "Gets dataset by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     GetDatasetRequest request = GetDatasetRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Dataset> future = dataLabelingServiceClient.getDatasetCallable().futureCall(request);
     // Do something
     Dataset response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,com.google.cloud.datalabeling.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.getDatasetCallable))))

(defn export-data-async
  "Exports data and annotations from dataset.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     String annotatedDataset = \"\";
     String filter = \"\";
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportDataOperationResponse response = dataLabelingServiceClient.exportDataAsync(formattedName, annotatedDataset, filter, outputConfig).get();
   }

  name - Required. Dataset resource name, format: projects/{project_id}/datasets/{dataset_id} - `java.lang.String`
  annotated-dataset - Required. Annotated dataset resource name. DataItem in Dataset and their annotations in specified annotated dataset will be exported. It's in format of projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/ {annotated_dataset_id} - `java.lang.String`
  filter - Optional. Filter is not supported at this moment. - `java.lang.String`
  output-config - Required. Specify the output destination. - `com.google.cloud.datalabeling.v1beta1.OutputConfig`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.datalabeling.v1beta1.ExportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ExportDataOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String name ^java.lang.String annotated-dataset ^java.lang.String filter ^com.google.cloud.datalabeling.v1beta1.OutputConfig output-config]
    (-> this (.exportDataAsync name annotated-dataset filter output-config)))
  ([^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.ExportDataRequest request]
    (-> this (.exportDataAsync request))))

(defn search-example-comparisons
  "Searchs example comparisons in evaluation, in format of examples of both ground truth and
   prediction(s). It is represented as a search with evaluation id.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatEvaluationName(\"[PROJECT]\", \"[DATASET]\", \"[EVALUATION]\");
     for (SearchExampleComparisonsResponse.ExampleComparison element : dataLabelingServiceClient.searchExampleComparisons(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Name of the Evaluation resource to search example comparison from. Format: projects/{project_id}/datasets/{dataset_id}/evaluations/{evaluation_id} - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPagedResponse [^DataLabelingServiceClient this ^java.lang.String parent]
    (-> this (.searchExampleComparisons parent))))

(defn delete-annotation-spec-set-callable
  "Deletes an annotation spec set by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatAnnotationSpecSetName(\"[PROJECT]\", \"[ANNOTATION_SPEC_SET]\");
     DeleteAnnotationSpecSetRequest request = DeleteAnnotationSpecSetRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Void> future = dataLabelingServiceClient.deleteAnnotationSpecSetCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.deleteAnnotationSpecSetCallable))))

(defn get-settings
  "returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings`"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings [^DataLabelingServiceClient this]
    (-> this (.getSettings))))

(defn list-annotated-datasets-callable
  "Lists annotated datasets for a dataset. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     ListAnnotatedDatasetsRequest request = ListAnnotatedDatasetsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListAnnotatedDatasetsResponse response = dataLabelingServiceClient.listAnnotatedDatasetsCallable().call(request);
       for (AnnotatedDataset element : response.getAnnotatedDatasetsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listAnnotatedDatasetsCallable))))

(defn create-annotation-spec-set-callable
  "Creates an annotation spec set by providing a set of labels.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     AnnotationSpecSet annotationSpecSet = AnnotationSpecSet.newBuilder().build();
     CreateAnnotationSpecSetRequest request = CreateAnnotationSpecSetRequest.newBuilder()
       .setParent(formattedParent)
       .setAnnotationSpecSet(annotationSpecSet)
       .build();
     ApiFuture<AnnotationSpecSet> future = dataLabelingServiceClient.createAnnotationSpecSetCallable().futureCall(request);
     // Do something
     AnnotationSpecSet response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.createAnnotationSpecSetCallable))))

(defn get-evaluation-job-callable
  "Gets an evaluation job by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationJobName(\"[PROJECT]\", \"[EVALUATION_JOB]\");
     GetEvaluationJobRequest request = GetEvaluationJobRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<EvaluationJob> future = dataLabelingServiceClient.getEvaluationJobCallable().futureCall(request);
     // Do something
     EvaluationJob response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.getEvaluationJobCallable))))

(defn resume-evaluation-job
  "Resumes a paused evaluation job. Deleted evaluation job can't be resumed. Resuming a running
   evaluation job will be a no-op.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationJobName(\"[PROJECT]\", \"[EVALUATION_JOB]\");
     dataLabelingServiceClient.resumeEvaluationJob(formattedName);
   }

  name - Required. Name of the evaluation job that is going to be resumed. Format: 'projects/{project_id}/evaluationJobs/{evaluation_job_id}' - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.resumeEvaluationJob name))))

(defn label-image-async
  "Starts a labeling task for image. The type of image labeling task is configured by feature in
   the request.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     HumanAnnotationConfig basicConfig = HumanAnnotationConfig.newBuilder().build();
     LabelImageRequest.Feature feature = LabelImageRequest.Feature.FEATURE_UNSPECIFIED;
     AnnotatedDataset response = dataLabelingServiceClient.labelImageAsync(formattedParent, basicConfig, feature).get();
   }

  parent - Required. Name of the dataset to request labeling task, format: projects/{project_id}/datasets/{dataset_id} - `java.lang.String`
  basic-config - Required. Basic human annotation config. - `com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig`
  feature - Required. The type of image labeling task. - `com.google.cloud.datalabeling.v1beta1.LabelImageRequest$Feature`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String parent ^com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic-config ^com.google.cloud.datalabeling.v1beta1.LabelImageRequest$Feature feature]
    (-> this (.labelImageAsync parent basic-config feature)))
  ([^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.LabelImageRequest request]
    (-> this (.labelImageAsync request))))

(defn list-data-items-paged-callable
  "Lists data items in a dataset. This API can be called after data are imported into dataset.
   Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     ListDataItemsRequest request = ListDataItemsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListDataItemsPagedResponse> future = dataLabelingServiceClient.listDataItemsPagedCallable().futureCall(request);
     // Do something
     for (DataItem element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listDataItemsPagedCallable))))

(defn update-evaluation-job
  "Updates an evaluation job.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     EvaluationJob evaluationJob = EvaluationJob.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     EvaluationJob response = dataLabelingServiceClient.updateEvaluationJob(evaluationJob, updateMask);
   }

  evaluation-job - Required. Evaluation job that is going to be updated. - `com.google.cloud.datalabeling.v1beta1.EvaluationJob`
  update-mask - Optional. Mask for which field in evaluation_job should be updated. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.datalabeling.v1beta1.EvaluationJob`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.EvaluationJob [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.EvaluationJob evaluation-job ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateEvaluationJob evaluation-job update-mask)))
  (^com.google.cloud.datalabeling.v1beta1.EvaluationJob [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest request]
    (-> this (.updateEvaluationJob request))))

(defn delete-instruction
  "Deletes an instruction object by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatInstructionName(\"[PROJECT]\", \"[INSTRUCTION]\");
     dataLabelingServiceClient.deleteInstruction(formattedName);
   }

  name - Required. Instruction resource name, format: projects/{project_id}/instructions/{instruction_id} - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.deleteInstruction name))))

(defn delete-instruction-callable
  "Deletes an instruction object by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatInstructionName(\"[PROJECT]\", \"[INSTRUCTION]\");
     DeleteInstructionRequest request = DeleteInstructionRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Void> future = dataLabelingServiceClient.deleteInstructionCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.deleteInstructionCallable))))

(defn create-dataset-callable
  "Creates dataset. If success return a Dataset resource.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     Dataset dataset = Dataset.newBuilder().build();
     CreateDatasetRequest request = CreateDatasetRequest.newBuilder()
       .setParent(formattedParent)
       .setDataset(dataset)
       .build();
     ApiFuture<Dataset> future = dataLabelingServiceClient.createDatasetCallable().futureCall(request);
     // Do something
     Dataset response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,com.google.cloud.datalabeling.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.createDatasetCallable))))

(defn get-evaluation
  "Gets an evaluation by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationName(\"[PROJECT]\", \"[DATASET]\", \"[EVALUATION]\");
     Evaluation response = dataLabelingServiceClient.getEvaluation(formattedName);
   }

  name - Required. Name of the evaluation. Format: 'projects/{project_id}/datasets/{dataset_id}/evaluations/{evaluation_id}' - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.Evaluation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.Evaluation [^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.getEvaluation name))))

(defn get-instruction-callable
  "Gets an instruction by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatInstructionName(\"[PROJECT]\", \"[INSTRUCTION]\");
     GetInstructionRequest request = GetInstructionRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Instruction> future = dataLabelingServiceClient.getInstructionCallable().futureCall(request);
     // Do something
     Instruction response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,com.google.cloud.datalabeling.v1beta1.Instruction>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.getInstructionCallable))))

(defn delete-annotated-dataset-callable
  "Deletes an annotated dataset by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     DeleteAnnotatedDatasetRequest request = DeleteAnnotatedDatasetRequest.newBuilder().build();
     ApiFuture<Void> future = dataLabelingServiceClient.deleteAnnotatedDatasetCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.deleteAnnotatedDatasetCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStub`"
  ([^DataLabelingServiceClient this]
    (-> this (.getStub))))

(defn list-examples-callable
  "Lists examples in an annotated dataset. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatAnnotatedDatasetName(\"[PROJECT]\", \"[DATASET]\", \"[ANNOTATED_DATASET]\");
     ListExamplesRequest request = ListExamplesRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListExamplesResponse response = dataLabelingServiceClient.listExamplesCallable().call(request);
       for (Example element : response.getExamplesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listExamplesCallable))))

(defn get-example
  "Gets an example by resource name, including both data and annotation.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatExampleName(\"[PROJECT]\", \"[DATASET]\", \"[ANNOTATED_DATASET]\", \"[EXAMPLE]\");
     String filter = \"\";
     Example response = dataLabelingServiceClient.getExample(formattedName, filter);
   }

  name - Required. Name of example, format: projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/ {annotated_dataset_id}/examples/{example_id} - `java.lang.String`
  filter - Optional. An expression for filtering Examples. Filter by annotation_spec.display_name is supported. Format \"annotation_spec.display_name = {display_name}\" - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.Example`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.Example [^DataLabelingServiceClient this ^java.lang.String name ^java.lang.String filter]
    (-> this (.getExample name filter)))
  (^com.google.cloud.datalabeling.v1beta1.Example [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.GetExampleRequest request]
    (-> this (.getExample request))))

(defn get-dataset
  "Gets dataset by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     Dataset response = dataLabelingServiceClient.getDataset(formattedName);
   }

  name - Required. Dataset resource name, format: projects/{project_id}/datasets/{dataset_id} - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.Dataset`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.Dataset [^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.getDataset name))))

(defn delete-evaluation-job
  "Stops and deletes an evaluation job.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationJobName(\"[PROJECT]\", \"[EVALUATION_JOB]\");
     dataLabelingServiceClient.deleteEvaluationJob(formattedName);
   }

  name - Required. Name of the evaluation job that is going to be deleted. Format: 'projects/{project_id}/evaluationJobs/{evaluation_job_id}' - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.deleteEvaluationJob name))))

(defn get-evaluation-callable
  "Gets an evaluation by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationName(\"[PROJECT]\", \"[DATASET]\", \"[EVALUATION]\");
     GetEvaluationRequest request = GetEvaluationRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Evaluation> future = dataLabelingServiceClient.getEvaluationCallable().futureCall(request);
     // Do something
     Evaluation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,com.google.cloud.datalabeling.v1beta1.Evaluation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.getEvaluationCallable))))

(defn list-annotation-spec-sets-callable
  "Lists annotation spec sets for a project. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     ListAnnotationSpecSetsRequest request = ListAnnotationSpecSetsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListAnnotationSpecSetsResponse response = dataLabelingServiceClient.listAnnotationSpecSetsCallable().call(request);
       for (AnnotationSpecSet element : response.getAnnotationSpecSetsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listAnnotationSpecSetsCallable))))

(defn list-datasets
  "Lists datasets under a project. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     String filter = \"\";
     for (Dataset element : dataLabelingServiceClient.listDatasets(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Dataset resource parent, format: projects/{project_id} - `java.lang.String`
  filter - Optional. Filter on dataset is not supported at this moment. - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsPagedResponse [^DataLabelingServiceClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.listDatasets parent filter)))
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsPagedResponse [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest request]
    (-> this (.listDatasets request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^DataLabelingServiceClient this]
    (-> this (.isShutdown))))

(defn get-annotation-spec-set
  "Gets an annotation spec set by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatAnnotationSpecSetName(\"[PROJECT]\", \"[ANNOTATION_SPEC_SET]\");
     AnnotationSpecSet response = dataLabelingServiceClient.getAnnotationSpecSet(formattedName);
   }

  name - Required. AnnotationSpecSet resource name, format: projects/{project_id}/annotationSpecSets/{annotation_spec_set_id} - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet [^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.getAnnotationSpecSet name))))

(defn label-text-async
  "Starts a labeling task for text. The type of text labeling task is configured by feature in the
   request.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     HumanAnnotationConfig basicConfig = HumanAnnotationConfig.newBuilder().build();
     LabelTextRequest.Feature feature = LabelTextRequest.Feature.FEATURE_UNSPECIFIED;
     AnnotatedDataset response = dataLabelingServiceClient.labelTextAsync(formattedParent, basicConfig, feature).get();
   }

  parent - Required. Name of the data set to request labeling task, format: projects/{project_id}/datasets/{dataset_id} - `java.lang.String`
  basic-config - Required. Basic human annotation config. - `com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig`
  feature - Required. The type of text labeling task. - `com.google.cloud.datalabeling.v1beta1.LabelTextRequest$Feature`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String parent ^com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic-config ^com.google.cloud.datalabeling.v1beta1.LabelTextRequest$Feature feature]
    (-> this (.labelTextAsync parent basic-config feature)))
  ([^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.LabelTextRequest request]
    (-> this (.labelTextAsync request))))

(defn delete-dataset-callable
  "Deletes a dataset by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     DeleteDatasetRequest request = DeleteDatasetRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Void> future = dataLabelingServiceClient.deleteDatasetCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.deleteDatasetCallable))))

(defn search-evaluations-paged-callable
  "Searchs evaluations within a project. Supported filter: evaluation_job, evaluation_time.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     String filter = \"\";
     SearchEvaluationsRequest request = SearchEvaluationsRequest.newBuilder()
       .setParent(formattedParent)
       .setFilter(filter)
       .build();
     ApiFuture<SearchEvaluationsPagedResponse> future = dataLabelingServiceClient.searchEvaluationsPagedCallable().futureCall(request);
     // Do something
     for (Evaluation element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.searchEvaluationsPagedCallable))))

(defn get-instruction
  "Gets an instruction by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatInstructionName(\"[PROJECT]\", \"[INSTRUCTION]\");
     Instruction response = dataLabelingServiceClient.getInstruction(formattedName);
   }

  name - Required. Instruction resource name, format: projects/{project_id}/instructions/{instruction_id} - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.Instruction`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.Instruction [^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.getInstruction name))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^DataLabelingServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn label-text-callable
  "Starts a labeling task for text. The type of text labeling task is configured by feature in the
   request.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     HumanAnnotationConfig basicConfig = HumanAnnotationConfig.newBuilder().build();
     LabelTextRequest.Feature feature = LabelTextRequest.Feature.FEATURE_UNSPECIFIED;
     LabelTextRequest request = LabelTextRequest.newBuilder()
       .setParent(formattedParent)
       .setBasicConfig(basicConfig)
       .setFeature(feature)
       .build();
     ApiFuture<Operation> future = dataLabelingServiceClient.labelTextCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.LabelTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.labelTextCallable))))

(defn label-video-async
  "Starts a labeling task for video. The type of video labeling task is configured by feature in
   the request.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     HumanAnnotationConfig basicConfig = HumanAnnotationConfig.newBuilder().build();
     LabelVideoRequest.Feature feature = LabelVideoRequest.Feature.FEATURE_UNSPECIFIED;
     AnnotatedDataset response = dataLabelingServiceClient.labelVideoAsync(formattedParent, basicConfig, feature).get();
   }

  parent - Required. Name of the dataset to request labeling task, format: projects/{project_id}/datasets/{dataset_id} - `java.lang.String`
  basic-config - Required. Basic human annotation config. - `com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig`
  feature - Required. The type of video labeling task. - `com.google.cloud.datalabeling.v1beta1.LabelVideoRequest$Feature`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String parent ^com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic-config ^com.google.cloud.datalabeling.v1beta1.LabelVideoRequest$Feature feature]
    (-> this (.labelVideoAsync parent basic-config feature)))
  ([^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.LabelVideoRequest request]
    (-> this (.labelVideoAsync request))))

(defn create-instruction-callable
  "Creates an instruction for how data should be labeled.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     Instruction instruction = Instruction.newBuilder().build();
     CreateInstructionRequest request = CreateInstructionRequest.newBuilder()
       .setParent(formattedParent)
       .setInstruction(instruction)
       .build();
     ApiFuture<Operation> future = dataLabelingServiceClient.createInstructionCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.createInstructionCallable))))

(defn label-video-callable
  "Starts a labeling task for video. The type of video labeling task is configured by feature in
   the request.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     HumanAnnotationConfig basicConfig = HumanAnnotationConfig.newBuilder().build();
     LabelVideoRequest.Feature feature = LabelVideoRequest.Feature.FEATURE_UNSPECIFIED;
     LabelVideoRequest request = LabelVideoRequest.newBuilder()
       .setParent(formattedParent)
       .setBasicConfig(basicConfig)
       .setFeature(feature)
       .build();
     ApiFuture<Operation> future = dataLabelingServiceClient.labelVideoCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.labelVideoCallable))))

(defn shutdown
  ""
  ([^DataLabelingServiceClient this]
    (-> this (.shutdown))))

(defn create-annotation-spec-set
  "Creates an annotation spec set by providing a set of labels.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     AnnotationSpecSet annotationSpecSet = AnnotationSpecSet.newBuilder().build();
     AnnotationSpecSet response = dataLabelingServiceClient.createAnnotationSpecSet(formattedParent, annotationSpecSet);
   }

  parent - Required. AnnotationSpecSet resource parent, format: projects/{project_id} - `java.lang.String`
  annotation-spec-set - Required. Annotation spec set to create. Annotation specs must be included. Only one annotation spec will be accepted for annotation specs with same display_name. - `com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet`

  returns: `com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet [^DataLabelingServiceClient this ^java.lang.String parent ^com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation-spec-set]
    (-> this (.createAnnotationSpecSet parent annotation-spec-set)))
  (^com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest request]
    (-> this (.createAnnotationSpecSet request))))

(defn list-examples
  "Lists examples in an annotated dataset. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatAnnotatedDatasetName(\"[PROJECT]\", \"[DATASET]\", \"[ANNOTATED_DATASET]\");
     String filter = \"\";
     for (Example element : dataLabelingServiceClient.listExamples(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Example resource parent. - `java.lang.String`
  filter - Optional. An expression for filtering Examples. For annotated datasets that have annotation spec set, filter by annotation_spec.display_name is supported. Format \"annotation_spec.display_name = {display_name}\" - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesPagedResponse [^DataLabelingServiceClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.listExamples parent filter)))
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesPagedResponse [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.ListExamplesRequest request]
    (-> this (.listExamples request))))

(defn list-data-items
  "Lists data items in a dataset. This API can be called after data are imported into dataset.
   Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     String filter = \"\";
     for (DataItem element : dataLabelingServiceClient.listDataItems(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Name of the dataset to list data items, format: projects/{project_id}/datasets/{dataset_id} - `java.lang.String`
  filter - Optional. Filter is not supported at this moment. - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsPagedResponse [^DataLabelingServiceClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.listDataItems parent filter)))
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsPagedResponse [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest request]
    (-> this (.listDataItems request))))

(defn list-evaluation-jobs-paged-callable
  "Lists all evaluation jobs within a project with possible filters. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     String filter = \"\";
     ListEvaluationJobsRequest request = ListEvaluationJobsRequest.newBuilder()
       .setParent(formattedParent)
       .setFilter(filter)
       .build();
     ApiFuture<ListEvaluationJobsPagedResponse> future = dataLabelingServiceClient.listEvaluationJobsPagedCallable().futureCall(request);
     // Do something
     for (EvaluationJob element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listEvaluationJobsPagedCallable))))

(defn get-data-item
  "Gets a data item in a dataset by resource name. This API can be called after data are imported
   into dataset.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDataItemName(\"[PROJECT]\", \"[DATASET]\", \"[DATA_ITEM]\");
     DataItem response = dataLabelingServiceClient.getDataItem(formattedName);
   }

  name - Required. The name of the data item to get, format: projects/{project_id}/datasets/{dataset_id}/dataItems/{data_item_id} - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataItem`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataItem [^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.getDataItem name))))

(defn list-instructions-paged-callable
  "Lists instructions for a project. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     ListInstructionsRequest request = ListInstructionsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListInstructionsPagedResponse> future = dataLabelingServiceClient.listInstructionsPagedCallable().futureCall(request);
     // Do something
     for (Instruction element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listInstructionsPagedCallable))))

(defn list-annotation-spec-sets
  "Lists annotation spec sets for a project. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     String filter = \"\";
     for (AnnotationSpecSet element : dataLabelingServiceClient.listAnnotationSpecSets(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Parent of AnnotationSpecSet resource, format: projects/{project_id} - `java.lang.String`
  filter - Optional. Filter is not supported at this moment. - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPagedResponse [^DataLabelingServiceClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.listAnnotationSpecSets parent filter)))
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPagedResponse [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest request]
    (-> this (.listAnnotationSpecSets request))))

(defn update-evaluation-job-callable
  "Updates an evaluation job.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     EvaluationJob evaluationJob = EvaluationJob.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateEvaluationJobRequest request = UpdateEvaluationJobRequest.newBuilder()
       .setEvaluationJob(evaluationJob)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<EvaluationJob> future = dataLabelingServiceClient.updateEvaluationJobCallable().futureCall(request);
     // Do something
     EvaluationJob response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.updateEvaluationJobCallable))))

(defn list-instructions-callable
  "Lists instructions for a project. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     ListInstructionsRequest request = ListInstructionsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListInstructionsResponse response = dataLabelingServiceClient.listInstructionsCallable().call(request);
       for (Instruction element : response.getInstructionsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listInstructionsCallable))))

(defn get-annotation-spec-set-callable
  "Gets an annotation spec set by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatAnnotationSpecSetName(\"[PROJECT]\", \"[ANNOTATION_SPEC_SET]\");
     GetAnnotationSpecSetRequest request = GetAnnotationSpecSetRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<AnnotationSpecSet> future = dataLabelingServiceClient.getAnnotationSpecSetCallable().futureCall(request);
     // Do something
     AnnotationSpecSet response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.getAnnotationSpecSetCallable))))

(defn list-annotated-datasets-paged-callable
  "Lists annotated datasets for a dataset. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     ListAnnotatedDatasetsRequest request = ListAnnotatedDatasetsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListAnnotatedDatasetsPagedResponse> future = dataLabelingServiceClient.listAnnotatedDatasetsPagedCallable().futureCall(request);
     // Do something
     for (AnnotatedDataset element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listAnnotatedDatasetsPagedCallable))))

(defn import-data-callable
  "Imports data into dataset based on source locations defined in request. It can be called
   multiple times for the same dataset. Each dataset can only have one long running operation
   running on it. For example, no labeling task (also long running operation) can be started while
   importing is still ongoing. Vice versa.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     InputConfig inputConfig = InputConfig.newBuilder().build();
     ImportDataRequest request = ImportDataRequest.newBuilder()
       .setName(formattedName)
       .setInputConfig(inputConfig)
       .build();
     ApiFuture<Operation> future = dataLabelingServiceClient.importDataCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ImportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.importDataCallable))))

(defn create-evaluation-job
  "Creates an evaluation job.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     EvaluationJob job = EvaluationJob.newBuilder().build();
     EvaluationJob response = dataLabelingServiceClient.createEvaluationJob(formattedParent, job);
   }

  parent - Required. Evaluation job resource parent, format: projects/{project_id}. - `java.lang.String`
  job - Required. The evaluation job to create. - `com.google.cloud.datalabeling.v1beta1.EvaluationJob`

  returns: `com.google.cloud.datalabeling.v1beta1.EvaluationJob`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.EvaluationJob [^DataLabelingServiceClient this ^java.lang.String parent ^com.google.cloud.datalabeling.v1beta1.EvaluationJob job]
    (-> this (.createEvaluationJob parent job)))
  (^com.google.cloud.datalabeling.v1beta1.EvaluationJob [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest request]
    (-> this (.createEvaluationJob request))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^DataLabelingServiceClient this]
    (-> this (.getOperationsClient))))

(defn create-instruction-async
  "Creates an instruction for how data should be labeled.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     Instruction instruction = Instruction.newBuilder().build();
     Instruction response = dataLabelingServiceClient.createInstructionAsync(formattedParent, instruction).get();
   }

  parent - Required. Instruction resource parent, format: projects/{project_id} - `java.lang.String`
  instruction - Required. Instruction of how to perform the labeling task. - `com.google.cloud.datalabeling.v1beta1.Instruction`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.datalabeling.v1beta1.Instruction,com.google.cloud.datalabeling.v1beta1.CreateInstructionMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String parent ^com.google.cloud.datalabeling.v1beta1.Instruction instruction]
    (-> this (.createInstructionAsync parent instruction)))
  ([^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest request]
    (-> this (.createInstructionAsync request))))

(defn delete-annotation-spec-set
  "Deletes an annotation spec set by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatAnnotationSpecSetName(\"[PROJECT]\", \"[ANNOTATION_SPEC_SET]\");
     dataLabelingServiceClient.deleteAnnotationSpecSet(formattedName);
   }

  name - Required. AnnotationSpec resource name, format: `projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}`. - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.deleteAnnotationSpecSet name))))

(defn list-datasets-callable
  "Lists datasets under a project. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     ListDatasetsRequest request = ListDatasetsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListDatasetsResponse response = dataLabelingServiceClient.listDatasetsCallable().call(request);
       for (Dataset element : response.getDatasetsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listDatasetsCallable))))

(defn close
  ""
  ([^DataLabelingServiceClient this]
    (-> this (.close))))

(defn get-annotated-dataset-callable
  "Gets an annotated dataset by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatAnnotatedDatasetName(\"[PROJECT]\", \"[DATASET]\", \"[ANNOTATED_DATASET]\");
     GetAnnotatedDatasetRequest request = GetAnnotatedDatasetRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<AnnotatedDataset> future = dataLabelingServiceClient.getAnnotatedDatasetCallable().futureCall(request);
     // Do something
     AnnotatedDataset response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.getAnnotatedDatasetCallable))))

(defn create-evaluation-job-callable
  "Creates an evaluation job.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     EvaluationJob job = EvaluationJob.newBuilder().build();
     CreateEvaluationJobRequest request = CreateEvaluationJobRequest.newBuilder()
       .setParent(formattedParent)
       .setJob(job)
       .build();
     ApiFuture<EvaluationJob> future = dataLabelingServiceClient.createEvaluationJobCallable().futureCall(request);
     // Do something
     EvaluationJob response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.createEvaluationJobCallable))))

(defn label-image-callable
  "Starts a labeling task for image. The type of image labeling task is configured by feature in
   the request.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     HumanAnnotationConfig basicConfig = HumanAnnotationConfig.newBuilder().build();
     LabelImageRequest.Feature feature = LabelImageRequest.Feature.FEATURE_UNSPECIFIED;
     LabelImageRequest request = LabelImageRequest.newBuilder()
       .setParent(formattedParent)
       .setBasicConfig(basicConfig)
       .setFeature(feature)
       .build();
     ApiFuture<Operation> future = dataLabelingServiceClient.labelImageCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.LabelImageRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.labelImageCallable))))

(defn search-example-comparisons-callable
  "Searchs example comparisons in evaluation, in format of examples of both ground truth and
   prediction(s). It is represented as a search with evaluation id.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatEvaluationName(\"[PROJECT]\", \"[DATASET]\", \"[EVALUATION]\");
     SearchExampleComparisonsRequest request = SearchExampleComparisonsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       SearchExampleComparisonsResponse response = dataLabelingServiceClient.searchExampleComparisonsCallable().call(request);
       for (SearchExampleComparisonsResponse.ExampleComparison element : response.getExampleComparisonsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.searchExampleComparisonsCallable))))

(defn label-text-operation-callable
  "Starts a labeling task for text. The type of text labeling task is configured by feature in the
   request.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     HumanAnnotationConfig basicConfig = HumanAnnotationConfig.newBuilder().build();
     LabelTextRequest.Feature feature = LabelTextRequest.Feature.FEATURE_UNSPECIFIED;
     LabelTextRequest request = LabelTextRequest.newBuilder()
       .setParent(formattedParent)
       .setBasicConfig(basicConfig)
       .setFeature(feature)
       .build();
     OperationFuture<AnnotatedDataset, LabelOperationMetadata> future = dataLabelingServiceClient.labelTextOperationCallable().futureCall(request);
     // Do something
     AnnotatedDataset response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.LabelTextRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^DataLabelingServiceClient this]
    (-> this (.labelTextOperationCallable))))

(defn export-data-operation-callable
  "Exports data and annotations from dataset.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     String annotatedDataset = \"\";
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportDataRequest request = ExportDataRequest.newBuilder()
       .setName(formattedName)
       .setAnnotatedDataset(annotatedDataset)
       .setOutputConfig(outputConfig)
       .build();
     OperationFuture<ExportDataOperationResponse, ExportDataOperationMetadata> future = dataLabelingServiceClient.exportDataOperationCallable().futureCall(request);
     // Do something
     ExportDataOperationResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.ExportDataRequest,com.google.cloud.datalabeling.v1beta1.ExportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ExportDataOperationMetadata>`"
  ([^DataLabelingServiceClient this]
    (-> this (.exportDataOperationCallable))))

(defn get-data-item-callable
  "Gets a data item in a dataset by resource name. This API can be called after data are imported
   into dataset.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDataItemName(\"[PROJECT]\", \"[DATASET]\", \"[DATA_ITEM]\");
     GetDataItemRequest request = GetDataItemRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<DataItem> future = dataLabelingServiceClient.getDataItemCallable().futureCall(request);
     // Do something
     DataItem response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,com.google.cloud.datalabeling.v1beta1.DataItem>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.getDataItemCallable))))

(defn delete-evaluation-job-callable
  "Stops and deletes an evaluation job.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationJobName(\"[PROJECT]\", \"[EVALUATION_JOB]\");
     DeleteEvaluationJobRequest request = DeleteEvaluationJobRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Void> future = dataLabelingServiceClient.deleteEvaluationJobCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.deleteEvaluationJobCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^DataLabelingServiceClient this]
    (-> this (.isTerminated))))

(defn get-annotated-dataset
  "Gets an annotated dataset by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatAnnotatedDatasetName(\"[PROJECT]\", \"[DATASET]\", \"[ANNOTATED_DATASET]\");
     AnnotatedDataset response = dataLabelingServiceClient.getAnnotatedDataset(formattedName);
   }

  name - Required. Name of the annotated dataset to get, format: projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/ {annotated_dataset_id} - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.AnnotatedDataset`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.AnnotatedDataset [^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.getAnnotatedDataset name))))

(defn list-datasets-paged-callable
  "Lists datasets under a project. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     ListDatasetsRequest request = ListDatasetsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListDatasetsPagedResponse> future = dataLabelingServiceClient.listDatasetsPagedCallable().futureCall(request);
     // Do something
     for (Dataset element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listDatasetsPagedCallable))))

(defn list-evaluation-jobs
  "Lists all evaluation jobs within a project with possible filters. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     String filter = \"\";
     for (EvaluationJob element : dataLabelingServiceClient.listEvaluationJobs(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Evaluation resource parent. Format: \"projects/{project_id}\" - `java.lang.String`
  filter - Optional. Only support filter by model id and job state. Format: \"evaluation_job.model_id = {model_id} AND evaluation_job.state = {EvaluationJob::State}\" - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse [^DataLabelingServiceClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.listEvaluationJobs parent filter)))
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest request]
    (-> this (.listEvaluationJobs request))))

(defn delete-annotated-dataset
  "Deletes an annotated dataset by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     DeleteAnnotatedDatasetRequest request = DeleteAnnotatedDatasetRequest.newBuilder().build();
     dataLabelingServiceClient.deleteAnnotatedDataset(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest request]
    (-> this (.deleteAnnotatedDataset request))))

(defn import-data-async
  "Imports data into dataset based on source locations defined in request. It can be called
   multiple times for the same dataset. Each dataset can only have one long running operation
   running on it. For example, no labeling task (also long running operation) can be started while
   importing is still ongoing. Vice versa.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     InputConfig inputConfig = InputConfig.newBuilder().build();
     ImportDataOperationResponse response = dataLabelingServiceClient.importDataAsync(formattedName, inputConfig).get();
   }

  name - Required. Dataset resource name, format: projects/{project_id}/datasets/{dataset_id} - `java.lang.String`
  input-config - Required. Specify the input source of the data. - `com.google.cloud.datalabeling.v1beta1.InputConfig`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.datalabeling.v1beta1.ImportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ImportDataOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String name ^com.google.cloud.datalabeling.v1beta1.InputConfig input-config]
    (-> this (.importDataAsync name input-config)))
  ([^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.ImportDataRequest request]
    (-> this (.importDataAsync request))))

(defn get-example-callable
  "Gets an example by resource name, including both data and annotation.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatExampleName(\"[PROJECT]\", \"[DATASET]\", \"[ANNOTATED_DATASET]\", \"[EXAMPLE]\");
     GetExampleRequest request = GetExampleRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Example> future = dataLabelingServiceClient.getExampleCallable().futureCall(request);
     // Do something
     Example response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetExampleRequest,com.google.cloud.datalabeling.v1beta1.Example>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.getExampleCallable))))

(defn list-annotated-datasets
  "Lists annotated datasets for a dataset. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     String filter = \"\";
     for (AnnotatedDataset element : dataLabelingServiceClient.listAnnotatedDatasets(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Name of the dataset to list annotated datasets, format: projects/{project_id}/datasets/{dataset_id} - `java.lang.String`
  filter - Optional. Filter is not supported at this moment. - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPagedResponse [^DataLabelingServiceClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.listAnnotatedDatasets parent filter)))
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPagedResponse [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest request]
    (-> this (.listAnnotatedDatasets request))))

(defn create-instruction-operation-callable
  "Creates an instruction for how data should be labeled.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     Instruction instruction = Instruction.newBuilder().build();
     CreateInstructionRequest request = CreateInstructionRequest.newBuilder()
       .setParent(formattedParent)
       .setInstruction(instruction)
       .build();
     OperationFuture<Instruction, CreateInstructionMetadata> future = dataLabelingServiceClient.createInstructionOperationCallable().futureCall(request);
     // Do something
     Instruction response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,com.google.cloud.datalabeling.v1beta1.Instruction,com.google.cloud.datalabeling.v1beta1.CreateInstructionMetadata>`"
  ([^DataLabelingServiceClient this]
    (-> this (.createInstructionOperationCallable))))

(defn import-data-operation-callable
  "Imports data into dataset based on source locations defined in request. It can be called
   multiple times for the same dataset. Each dataset can only have one long running operation
   running on it. For example, no labeling task (also long running operation) can be started while
   importing is still ongoing. Vice versa.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     InputConfig inputConfig = InputConfig.newBuilder().build();
     ImportDataRequest request = ImportDataRequest.newBuilder()
       .setName(formattedName)
       .setInputConfig(inputConfig)
       .build();
     OperationFuture<ImportDataOperationResponse, ImportDataOperationMetadata> future = dataLabelingServiceClient.importDataOperationCallable().futureCall(request);
     // Do something
     ImportDataOperationResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.ImportDataRequest,com.google.cloud.datalabeling.v1beta1.ImportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ImportDataOperationMetadata>`"
  ([^DataLabelingServiceClient this]
    (-> this (.importDataOperationCallable))))

(defn delete-dataset
  "Deletes a dataset by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     dataLabelingServiceClient.deleteDataset(formattedName);
   }

  name - Required. Dataset resource name, format: projects/{project_id}/datasets/{dataset_id} - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.deleteDataset name))))

(defn search-example-comparisons-paged-callable
  "Searchs example comparisons in evaluation, in format of examples of both ground truth and
   prediction(s). It is represented as a search with evaluation id.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatEvaluationName(\"[PROJECT]\", \"[DATASET]\", \"[EVALUATION]\");
     SearchExampleComparisonsRequest request = SearchExampleComparisonsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<SearchExampleComparisonsPagedResponse> future = dataLabelingServiceClient.searchExampleComparisonsPagedCallable().futureCall(request);
     // Do something
     for (SearchExampleComparisonsResponse.ExampleComparison element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.searchExampleComparisonsPagedCallable))))

(defn list-examples-paged-callable
  "Lists examples in an annotated dataset. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatAnnotatedDatasetName(\"[PROJECT]\", \"[DATASET]\", \"[ANNOTATED_DATASET]\");
     ListExamplesRequest request = ListExamplesRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListExamplesPagedResponse> future = dataLabelingServiceClient.listExamplesPagedCallable().futureCall(request);
     // Do something
     for (Example element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listExamplesPagedCallable))))

(defn search-evaluations-callable
  "Searchs evaluations within a project. Supported filter: evaluation_job, evaluation_time.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     String filter = \"\";
     SearchEvaluationsRequest request = SearchEvaluationsRequest.newBuilder()
       .setParent(formattedParent)
       .setFilter(filter)
       .build();
     while (true) {
       SearchEvaluationsResponse response = dataLabelingServiceClient.searchEvaluationsCallable().call(request);
       for (Evaluation element : response.getEvaluationsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.searchEvaluationsCallable))))

(defn get-evaluation-job
  "Gets an evaluation job by resource name.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationJobName(\"[PROJECT]\", \"[EVALUATION_JOB]\");
     EvaluationJob response = dataLabelingServiceClient.getEvaluationJob(formattedName);
   }

  name - Required. Name of the evaluation job. Format: 'projects/{project_id}/evaluationJobs/{evaluation_job_id}' - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.EvaluationJob`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.EvaluationJob [^DataLabelingServiceClient this ^java.lang.String name]
    (-> this (.getEvaluationJob name))))

(defn label-image-operation-callable
  "Starts a labeling task for image. The type of image labeling task is configured by feature in
   the request.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     HumanAnnotationConfig basicConfig = HumanAnnotationConfig.newBuilder().build();
     LabelImageRequest.Feature feature = LabelImageRequest.Feature.FEATURE_UNSPECIFIED;
     LabelImageRequest request = LabelImageRequest.newBuilder()
       .setParent(formattedParent)
       .setBasicConfig(basicConfig)
       .setFeature(feature)
       .build();
     OperationFuture<AnnotatedDataset, LabelOperationMetadata> future = dataLabelingServiceClient.labelImageOperationCallable().futureCall(request);
     // Do something
     AnnotatedDataset response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.LabelImageRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^DataLabelingServiceClient this]
    (-> this (.labelImageOperationCallable))))

(defn export-data-callable
  "Exports data and annotations from dataset.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     String annotatedDataset = \"\";
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportDataRequest request = ExportDataRequest.newBuilder()
       .setName(formattedName)
       .setAnnotatedDataset(annotatedDataset)
       .setOutputConfig(outputConfig)
       .build();
     ApiFuture<Operation> future = dataLabelingServiceClient.exportDataCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ExportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.exportDataCallable))))

(defn resume-evaluation-job-callable
  "Resumes a paused evaluation job. Deleted evaluation job can't be resumed. Resuming a running
   evaluation job will be a no-op.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedName = DataLabelingServiceClient.formatEvaluationJobName(\"[PROJECT]\", \"[EVALUATION_JOB]\");
     ResumeEvaluationJobRequest request = ResumeEvaluationJobRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Void> future = dataLabelingServiceClient.resumeEvaluationJobCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.resumeEvaluationJobCallable))))

(defn list-data-items-callable
  "Lists data items in a dataset. This API can be called after data are imported into dataset.
   Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     ListDataItemsRequest request = ListDataItemsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListDataItemsResponse response = dataLabelingServiceClient.listDataItemsCallable().call(request);
       for (DataItem element : response.getDataItemsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataLabelingServiceClient this]
    (-> this (.listDataItemsCallable))))

(defn list-instructions
  "Lists instructions for a project. Pagination is supported.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatProjectName(\"[PROJECT]\");
     String filter = \"\";
     for (Instruction element : dataLabelingServiceClient.listInstructions(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Instruction resource parent, format: projects/{project_id} - `java.lang.String`
  filter - Optional. Filter is not supported at this moment. - `java.lang.String`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsPagedResponse [^DataLabelingServiceClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.listInstructions parent filter)))
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsPagedResponse [^DataLabelingServiceClient this ^com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest request]
    (-> this (.listInstructions request))))

(defn shutdown-now
  ""
  ([^DataLabelingServiceClient this]
    (-> this (.shutdownNow))))

(defn label-video-operation-callable
  "Starts a labeling task for video. The type of video labeling task is configured by feature in
   the request.

   Sample code:



   try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
     String formattedParent = DataLabelingServiceClient.formatDatasetName(\"[PROJECT]\", \"[DATASET]\");
     HumanAnnotationConfig basicConfig = HumanAnnotationConfig.newBuilder().build();
     LabelVideoRequest.Feature feature = LabelVideoRequest.Feature.FEATURE_UNSPECIFIED;
     LabelVideoRequest request = LabelVideoRequest.newBuilder()
       .setParent(formattedParent)
       .setBasicConfig(basicConfig)
       .setFeature(feature)
       .build();
     OperationFuture<AnnotatedDataset, LabelOperationMetadata> future = dataLabelingServiceClient.labelVideoOperationCallable().futureCall(request);
     // Do something
     AnnotatedDataset response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^DataLabelingServiceClient this]
    (-> this (.labelVideoOperationCallable))))

