/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/common.proto

package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * A target publish or event time. Can be used for seeking to or retrieving the
 * corresponding cursor.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.TimeTarget}
 */
public final class TimeTarget extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.TimeTarget)
    TimeTargetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TimeTarget.newBuilder() to construct.
  private TimeTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TimeTarget() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TimeTarget();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TimeTarget(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (timeCase_ == 1) {
                subBuilder = ((com.google.protobuf.Timestamp) time_).toBuilder();
              }
              time_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.protobuf.Timestamp) time_);
                time_ = subBuilder.buildPartial();
              }
              timeCase_ = 1;
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (timeCase_ == 2) {
                subBuilder = ((com.google.protobuf.Timestamp) time_).toBuilder();
              }
              time_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.protobuf.Timestamp) time_);
                time_ = subBuilder.buildPartial();
              }
              timeCase_ = 2;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.CommonProto
        .internal_static_google_cloud_pubsublite_v1_TimeTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.CommonProto
        .internal_static_google_cloud_pubsublite_v1_TimeTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.TimeTarget.class,
            com.google.cloud.pubsublite.proto.TimeTarget.Builder.class);
  }

  private int timeCase_ = 0;
  private java.lang.Object time_;

  public enum TimeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PUBLISH_TIME(1),
    EVENT_TIME(2),
    TIME_NOT_SET(0);
    private final int value;

    private TimeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TimeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TimeCase forNumber(int value) {
      switch (value) {
        case 1:
          return PUBLISH_TIME;
        case 2:
          return EVENT_TIME;
        case 0:
          return TIME_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TimeCase getTimeCase() {
    return TimeCase.forNumber(timeCase_);
  }

  public static final int PUBLISH_TIME_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Request the cursor of the first message with publish time greater than or
   * equal to `publish_time`. All messages thereafter are guaranteed to have
   * publish times &gt;= `publish_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 1;</code>
   *
   * @return Whether the publishTime field is set.
   */
  @java.lang.Override
  public boolean hasPublishTime() {
    return timeCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Request the cursor of the first message with publish time greater than or
   * equal to `publish_time`. All messages thereafter are guaranteed to have
   * publish times &gt;= `publish_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 1;</code>
   *
   * @return The publishTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getPublishTime() {
    if (timeCase_ == 1) {
      return (com.google.protobuf.Timestamp) time_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Request the cursor of the first message with publish time greater than or
   * equal to `publish_time`. All messages thereafter are guaranteed to have
   * publish times &gt;= `publish_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getPublishTimeOrBuilder() {
    if (timeCase_ == 1) {
      return (com.google.protobuf.Timestamp) time_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }

  public static final int EVENT_TIME_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Request the cursor of the first message with event time greater than or
   * equal to `event_time`. If messages are missing an event time, the publish
   * time is used as a fallback. As event times are user supplied, subsequent
   * messages may have event times less than `event_time` and should be
   * filtered by the client, if necessary.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   *
   * @return Whether the eventTime field is set.
   */
  @java.lang.Override
  public boolean hasEventTime() {
    return timeCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Request the cursor of the first message with event time greater than or
   * equal to `event_time`. If messages are missing an event time, the publish
   * time is used as a fallback. As event times are user supplied, subsequent
   * messages may have event times less than `event_time` and should be
   * filtered by the client, if necessary.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   *
   * @return The eventTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEventTime() {
    if (timeCase_ == 2) {
      return (com.google.protobuf.Timestamp) time_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Request the cursor of the first message with event time greater than or
   * equal to `event_time`. If messages are missing an event time, the publish
   * time is used as a fallback. As event times are user supplied, subsequent
   * messages may have event times less than `event_time` and should be
   * filtered by the client, if necessary.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder() {
    if (timeCase_ == 2) {
      return (com.google.protobuf.Timestamp) time_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (timeCase_ == 1) {
      output.writeMessage(1, (com.google.protobuf.Timestamp) time_);
    }
    if (timeCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.Timestamp) time_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.protobuf.Timestamp) time_);
    }
    if (timeCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.protobuf.Timestamp) time_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.pubsublite.proto.TimeTarget)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.TimeTarget other =
        (com.google.cloud.pubsublite.proto.TimeTarget) obj;

    if (!getTimeCase().equals(other.getTimeCase())) return false;
    switch (timeCase_) {
      case 1:
        if (!getPublishTime().equals(other.getPublishTime())) return false;
        break;
      case 2:
        if (!getEventTime().equals(other.getEventTime())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (timeCase_) {
      case 1:
        hash = (37 * hash) + PUBLISH_TIME_FIELD_NUMBER;
        hash = (53 * hash) + getPublishTime().hashCode();
        break;
      case 2:
        hash = (37 * hash) + EVENT_TIME_FIELD_NUMBER;
        hash = (53 * hash) + getEventTime().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.pubsublite.proto.TimeTarget prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A target publish or event time. Can be used for seeking to or retrieving the
   * corresponding cursor.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.TimeTarget}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.TimeTarget)
      com.google.cloud.pubsublite.proto.TimeTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.CommonProto
          .internal_static_google_cloud_pubsublite_v1_TimeTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.CommonProto
          .internal_static_google_cloud_pubsublite_v1_TimeTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.TimeTarget.class,
              com.google.cloud.pubsublite.proto.TimeTarget.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.TimeTarget.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      timeCase_ = 0;
      time_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.CommonProto
          .internal_static_google_cloud_pubsublite_v1_TimeTarget_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.TimeTarget getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.TimeTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.TimeTarget build() {
      com.google.cloud.pubsublite.proto.TimeTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.TimeTarget buildPartial() {
      com.google.cloud.pubsublite.proto.TimeTarget result =
          new com.google.cloud.pubsublite.proto.TimeTarget(this);
      if (timeCase_ == 1) {
        if (publishTimeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = publishTimeBuilder_.build();
        }
      }
      if (timeCase_ == 2) {
        if (eventTimeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = eventTimeBuilder_.build();
        }
      }
      result.timeCase_ = timeCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.pubsublite.proto.TimeTarget) {
        return mergeFrom((com.google.cloud.pubsublite.proto.TimeTarget) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.TimeTarget other) {
      if (other == com.google.cloud.pubsublite.proto.TimeTarget.getDefaultInstance()) return this;
      switch (other.getTimeCase()) {
        case PUBLISH_TIME:
          {
            mergePublishTime(other.getPublishTime());
            break;
          }
        case EVENT_TIME:
          {
            mergeEventTime(other.getEventTime());
            break;
          }
        case TIME_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.pubsublite.proto.TimeTarget parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.pubsublite.proto.TimeTarget) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int timeCase_ = 0;
    private java.lang.Object time_;

    public TimeCase getTimeCase() {
      return TimeCase.forNumber(timeCase_);
    }

    public Builder clearTime() {
      timeCase_ = 0;
      time_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        publishTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with publish time greater than or
     * equal to `publish_time`. All messages thereafter are guaranteed to have
     * publish times &gt;= `publish_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 1;</code>
     *
     * @return Whether the publishTime field is set.
     */
    @java.lang.Override
    public boolean hasPublishTime() {
      return timeCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with publish time greater than or
     * equal to `publish_time`. All messages thereafter are guaranteed to have
     * publish times &gt;= `publish_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 1;</code>
     *
     * @return The publishTime.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getPublishTime() {
      if (publishTimeBuilder_ == null) {
        if (timeCase_ == 1) {
          return (com.google.protobuf.Timestamp) time_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      } else {
        if (timeCase_ == 1) {
          return publishTimeBuilder_.getMessage();
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with publish time greater than or
     * equal to `publish_time`. All messages thereafter are guaranteed to have
     * publish times &gt;= `publish_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 1;</code>
     */
    public Builder setPublishTime(com.google.protobuf.Timestamp value) {
      if (publishTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
        onChanged();
      } else {
        publishTimeBuilder_.setMessage(value);
      }
      timeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with publish time greater than or
     * equal to `publish_time`. All messages thereafter are guaranteed to have
     * publish times &gt;= `publish_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 1;</code>
     */
    public Builder setPublishTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (publishTimeBuilder_ == null) {
        time_ = builderForValue.build();
        onChanged();
      } else {
        publishTimeBuilder_.setMessage(builderForValue.build());
      }
      timeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with publish time greater than or
     * equal to `publish_time`. All messages thereafter are guaranteed to have
     * publish times &gt;= `publish_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 1;</code>
     */
    public Builder mergePublishTime(com.google.protobuf.Timestamp value) {
      if (publishTimeBuilder_ == null) {
        if (timeCase_ == 1 && time_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          time_ =
              com.google.protobuf.Timestamp.newBuilder((com.google.protobuf.Timestamp) time_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          time_ = value;
        }
        onChanged();
      } else {
        if (timeCase_ == 1) {
          publishTimeBuilder_.mergeFrom(value);
        } else {
          publishTimeBuilder_.setMessage(value);
        }
      }
      timeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with publish time greater than or
     * equal to `publish_time`. All messages thereafter are guaranteed to have
     * publish times &gt;= `publish_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 1;</code>
     */
    public Builder clearPublishTime() {
      if (publishTimeBuilder_ == null) {
        if (timeCase_ == 1) {
          timeCase_ = 0;
          time_ = null;
          onChanged();
        }
      } else {
        if (timeCase_ == 1) {
          timeCase_ = 0;
          time_ = null;
        }
        publishTimeBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with publish time greater than or
     * equal to `publish_time`. All messages thereafter are guaranteed to have
     * publish times &gt;= `publish_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getPublishTimeBuilder() {
      return getPublishTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with publish time greater than or
     * equal to `publish_time`. All messages thereafter are guaranteed to have
     * publish times &gt;= `publish_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getPublishTimeOrBuilder() {
      if ((timeCase_ == 1) && (publishTimeBuilder_ != null)) {
        return publishTimeBuilder_.getMessageOrBuilder();
      } else {
        if (timeCase_ == 1) {
          return (com.google.protobuf.Timestamp) time_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with publish time greater than or
     * equal to `publish_time`. All messages thereafter are guaranteed to have
     * publish times &gt;= `publish_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getPublishTimeFieldBuilder() {
      if (publishTimeBuilder_ == null) {
        if (!(timeCase_ == 1)) {
          time_ = com.google.protobuf.Timestamp.getDefaultInstance();
        }
        publishTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                (com.google.protobuf.Timestamp) time_, getParentForChildren(), isClean());
        time_ = null;
      }
      timeCase_ = 1;
      onChanged();
      ;
      return publishTimeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        eventTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with event time greater than or
     * equal to `event_time`. If messages are missing an event time, the publish
     * time is used as a fallback. As event times are user supplied, subsequent
     * messages may have event times less than `event_time` and should be
     * filtered by the client, if necessary.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     *
     * @return Whether the eventTime field is set.
     */
    @java.lang.Override
    public boolean hasEventTime() {
      return timeCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with event time greater than or
     * equal to `event_time`. If messages are missing an event time, the publish
     * time is used as a fallback. As event times are user supplied, subsequent
     * messages may have event times less than `event_time` and should be
     * filtered by the client, if necessary.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     *
     * @return The eventTime.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getEventTime() {
      if (eventTimeBuilder_ == null) {
        if (timeCase_ == 2) {
          return (com.google.protobuf.Timestamp) time_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      } else {
        if (timeCase_ == 2) {
          return eventTimeBuilder_.getMessage();
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with event time greater than or
     * equal to `event_time`. If messages are missing an event time, the publish
     * time is used as a fallback. As event times are user supplied, subsequent
     * messages may have event times less than `event_time` and should be
     * filtered by the client, if necessary.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public Builder setEventTime(com.google.protobuf.Timestamp value) {
      if (eventTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
        onChanged();
      } else {
        eventTimeBuilder_.setMessage(value);
      }
      timeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with event time greater than or
     * equal to `event_time`. If messages are missing an event time, the publish
     * time is used as a fallback. As event times are user supplied, subsequent
     * messages may have event times less than `event_time` and should be
     * filtered by the client, if necessary.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public Builder setEventTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (eventTimeBuilder_ == null) {
        time_ = builderForValue.build();
        onChanged();
      } else {
        eventTimeBuilder_.setMessage(builderForValue.build());
      }
      timeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with event time greater than or
     * equal to `event_time`. If messages are missing an event time, the publish
     * time is used as a fallback. As event times are user supplied, subsequent
     * messages may have event times less than `event_time` and should be
     * filtered by the client, if necessary.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public Builder mergeEventTime(com.google.protobuf.Timestamp value) {
      if (eventTimeBuilder_ == null) {
        if (timeCase_ == 2 && time_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          time_ =
              com.google.protobuf.Timestamp.newBuilder((com.google.protobuf.Timestamp) time_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          time_ = value;
        }
        onChanged();
      } else {
        if (timeCase_ == 2) {
          eventTimeBuilder_.mergeFrom(value);
        } else {
          eventTimeBuilder_.setMessage(value);
        }
      }
      timeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with event time greater than or
     * equal to `event_time`. If messages are missing an event time, the publish
     * time is used as a fallback. As event times are user supplied, subsequent
     * messages may have event times less than `event_time` and should be
     * filtered by the client, if necessary.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public Builder clearEventTime() {
      if (eventTimeBuilder_ == null) {
        if (timeCase_ == 2) {
          timeCase_ = 0;
          time_ = null;
          onChanged();
        }
      } else {
        if (timeCase_ == 2) {
          timeCase_ = 0;
          time_ = null;
        }
        eventTimeBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with event time greater than or
     * equal to `event_time`. If messages are missing an event time, the publish
     * time is used as a fallback. As event times are user supplied, subsequent
     * messages may have event times less than `event_time` and should be
     * filtered by the client, if necessary.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEventTimeBuilder() {
      return getEventTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with event time greater than or
     * equal to `event_time`. If messages are missing an event time, the publish
     * time is used as a fallback. As event times are user supplied, subsequent
     * messages may have event times less than `event_time` and should be
     * filtered by the client, if necessary.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder() {
      if ((timeCase_ == 2) && (eventTimeBuilder_ != null)) {
        return eventTimeBuilder_.getMessageOrBuilder();
      } else {
        if (timeCase_ == 2) {
          return (com.google.protobuf.Timestamp) time_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Request the cursor of the first message with event time greater than or
     * equal to `event_time`. If messages are missing an event time, the publish
     * time is used as a fallback. As event times are user supplied, subsequent
     * messages may have event times less than `event_time` and should be
     * filtered by the client, if necessary.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getEventTimeFieldBuilder() {
      if (eventTimeBuilder_ == null) {
        if (!(timeCase_ == 2)) {
          time_ = com.google.protobuf.Timestamp.getDefaultInstance();
        }
        eventTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                (com.google.protobuf.Timestamp) time_, getParentForChildren(), isClean());
        time_ = null;
      }
      timeCase_ = 2;
      onChanged();
      ;
      return eventTimeBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.TimeTarget)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.TimeTarget)
  private static final com.google.cloud.pubsublite.proto.TimeTarget DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.TimeTarget();
  }

  public static com.google.cloud.pubsublite.proto.TimeTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeTarget> PARSER =
      new com.google.protobuf.AbstractParser<TimeTarget>() {
        @java.lang.Override
        public TimeTarget parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TimeTarget(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TimeTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.TimeTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
