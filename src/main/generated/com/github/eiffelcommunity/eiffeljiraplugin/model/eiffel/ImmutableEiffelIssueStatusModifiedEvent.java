/*
 * Copyright 2018 Jaden Young
 * For a full list of individual contributors, please see the commit history.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EiffelIssueStatusModifiedEvent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEiffelIssueStatusModifiedEvent.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EiffelIssueStatusModifiedEvent"})
public final class ImmutableEiffelIssueStatusModifiedEvent
    implements EiffelIssueStatusModifiedEvent {
  private final ImmutableEiffelIssueStatusModifiedEventMeta meta;
  private final ImmutableEiffelIssueStatusModifiedEventData data;
  private final List<ImmutableLink> links;

  private ImmutableEiffelIssueStatusModifiedEvent(
      ImmutableEiffelIssueStatusModifiedEventMeta meta,
      ImmutableEiffelIssueStatusModifiedEventData data,
      List<ImmutableLink> links) {
    this.meta = meta;
    this.data = data;
    this.links = links;
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public ImmutableEiffelIssueStatusModifiedEventMeta meta() {
    return meta;
  }

  /**
   * @return The value of the {@code data} attribute
   */
  @JsonProperty("data")
  @Override
  public ImmutableEiffelIssueStatusModifiedEventData data() {
    return data;
  }

  /**
   * @return The value of the {@code links} attribute
   */
  @JsonProperty("links")
  @Override
  public List<ImmutableLink> links() {
    return links;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EiffelIssueStatusModifiedEvent#meta() meta} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for meta
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEiffelIssueStatusModifiedEvent withMeta(ImmutableEiffelIssueStatusModifiedEventMeta value) {
    if (this.meta == value) return this;
    ImmutableEiffelIssueStatusModifiedEventMeta newValue = Objects.requireNonNull(value, "meta");
    return new ImmutableEiffelIssueStatusModifiedEvent(newValue, this.data, this.links);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EiffelIssueStatusModifiedEvent#data() data} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for data
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEiffelIssueStatusModifiedEvent withData(ImmutableEiffelIssueStatusModifiedEventData value) {
    if (this.data == value) return this;
    ImmutableEiffelIssueStatusModifiedEventData newValue = Objects.requireNonNull(value, "data");
    return new ImmutableEiffelIssueStatusModifiedEvent(this.meta, newValue, this.links);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EiffelIssueStatusModifiedEvent#links() links}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEiffelIssueStatusModifiedEvent withLinks(ImmutableLink... elements) {
    List<ImmutableLink> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableEiffelIssueStatusModifiedEvent(this.meta, this.data, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EiffelIssueStatusModifiedEvent#links() links}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of links elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEiffelIssueStatusModifiedEvent withLinks(Iterable<? extends ImmutableLink> elements) {
    if (this.links == elements) return this;
    List<ImmutableLink> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableEiffelIssueStatusModifiedEvent(this.meta, this.data, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEiffelIssueStatusModifiedEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEiffelIssueStatusModifiedEvent
        && equalTo((ImmutableEiffelIssueStatusModifiedEvent) another);
  }

  private boolean equalTo(ImmutableEiffelIssueStatusModifiedEvent another) {
    return meta.equals(another.meta)
        && data.equals(another.data)
        && links.equals(another.links);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code data}, {@code links}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + meta.hashCode();
    h += (h << 5) + data.hashCode();
    h += (h << 5) + links.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EiffelIssueStatusModifiedEvent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EiffelIssueStatusModifiedEvent{"
        + "meta=" + meta
        + ", data=" + data
        + ", links=" + links
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements EiffelIssueStatusModifiedEvent {
    ImmutableEiffelIssueStatusModifiedEventMeta meta;
    ImmutableEiffelIssueStatusModifiedEventData data;
    List<ImmutableLink> links = Collections.emptyList();
    @JsonProperty("meta")
    public void setMeta(ImmutableEiffelIssueStatusModifiedEventMeta meta) {
      this.meta = meta;
    }
    @JsonProperty("data")
    public void setData(ImmutableEiffelIssueStatusModifiedEventData data) {
      this.data = data;
    }
    @JsonProperty("links")
    public void setLinks(List<ImmutableLink> links) {
      this.links = links;
    }
    @Override
    public ImmutableEiffelIssueStatusModifiedEventMeta meta() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableEiffelIssueStatusModifiedEventData data() { throw new UnsupportedOperationException(); }
    @Override
    public List<ImmutableLink> links() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEiffelIssueStatusModifiedEvent fromJson(Json json) {
    ImmutableEiffelIssueStatusModifiedEvent.Builder builder = ImmutableEiffelIssueStatusModifiedEvent.builder();
    if (json.meta != null) {
      builder.meta(json.meta);
    }
    if (json.data != null) {
      builder.data(json.data);
    }
    if (json.links != null) {
      builder.addAllLinks(json.links);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EiffelIssueStatusModifiedEvent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EiffelIssueStatusModifiedEvent instance
   */
  public static ImmutableEiffelIssueStatusModifiedEvent copyOf(EiffelIssueStatusModifiedEvent instance) {
    if (instance instanceof ImmutableEiffelIssueStatusModifiedEvent) {
      return (ImmutableEiffelIssueStatusModifiedEvent) instance;
    }
    return ImmutableEiffelIssueStatusModifiedEvent.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEiffelIssueStatusModifiedEvent ImmutableEiffelIssueStatusModifiedEvent}.
   * @return A new ImmutableEiffelIssueStatusModifiedEvent builder
   */
  public static ImmutableEiffelIssueStatusModifiedEvent.Builder builder() {
    return new ImmutableEiffelIssueStatusModifiedEvent.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEiffelIssueStatusModifiedEvent ImmutableEiffelIssueStatusModifiedEvent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_META = 0x1L;
    private static final long INIT_BIT_DATA = 0x2L;
    private long initBits = 0x3L;

    private ImmutableEiffelIssueStatusModifiedEventMeta meta;
    private ImmutableEiffelIssueStatusModifiedEventData data;
    private List<ImmutableLink> links = new ArrayList<ImmutableLink>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EiffelIssueStatusModifiedEvent} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EiffelIssueStatusModifiedEvent instance) {
      Objects.requireNonNull(instance, "instance");
      meta(instance.meta());
      data(instance.data());
      addAllLinks(instance.links());
      return this;
    }

    /**
     * Initializes the value for the {@link EiffelIssueStatusModifiedEvent#meta() meta} attribute.
     * @param meta The value for meta 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(ImmutableEiffelIssueStatusModifiedEventMeta meta) {
      this.meta = Objects.requireNonNull(meta, "meta");
      initBits &= ~INIT_BIT_META;
      return this;
    }

    /**
     * Initializes the value for the {@link EiffelIssueStatusModifiedEvent#data() data} attribute.
     * @param data The value for data 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("data")
    public final Builder data(ImmutableEiffelIssueStatusModifiedEventData data) {
      this.data = Objects.requireNonNull(data, "data");
      initBits &= ~INIT_BIT_DATA;
      return this;
    }

    /**
     * Adds one element to {@link EiffelIssueStatusModifiedEvent#links() links} list.
     * @param element A links element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addLinks(ImmutableLink element) {
      this.links.add(Objects.requireNonNull(element, "links element"));
      return this;
    }

    /**
     * Adds elements to {@link EiffelIssueStatusModifiedEvent#links() links} list.
     * @param elements An array of links elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addLinks(ImmutableLink... elements) {
      for (ImmutableLink element : elements) {
        this.links.add(Objects.requireNonNull(element, "links element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link EiffelIssueStatusModifiedEvent#links() links} list.
     * @param elements An iterable of links elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("links")
    public final Builder links(Iterable<? extends ImmutableLink> elements) {
      this.links.clear();
      return addAllLinks(elements);
    }

    /**
     * Adds elements to {@link EiffelIssueStatusModifiedEvent#links() links} list.
     * @param elements An iterable of links elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllLinks(Iterable<? extends ImmutableLink> elements) {
      for (ImmutableLink element : elements) {
        this.links.add(Objects.requireNonNull(element, "links element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableEiffelIssueStatusModifiedEvent ImmutableEiffelIssueStatusModifiedEvent}.
     * @return An immutable instance of EiffelIssueStatusModifiedEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEiffelIssueStatusModifiedEvent build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEiffelIssueStatusModifiedEvent(meta, data, createUnmodifiableList(true, links));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_META) != 0) attributes.add("meta");
      if ((initBits & INIT_BIT_DATA) != 0) attributes.add("data");
      return "Cannot build EiffelIssueStatusModifiedEvent, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<T>();
    } else {
      list = new ArrayList<T>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}