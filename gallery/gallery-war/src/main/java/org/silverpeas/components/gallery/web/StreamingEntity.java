/*
 * Copyright (C) 2000 - 2014 Silverpeas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * As a special exception to the terms and conditions of version 3.0 of
 * the GPL, you may redistribute this Program in connection with Free/Libre
 * Open Source Software ("FLOSS") applications as described in Silverpeas's
 * FLOSS exception. You should have recieved a copy of the text describing
 * the FLOSS exception, and it is also available here:
 * "http://www.silverpeas.org/docs/core/legal/floss_exception.html"
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.silverpeas.components.gallery.web;

import org.silverpeas.components.gallery.constant.StreamingProvider;
import org.silverpeas.components.gallery.model.Streaming;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yohann Chastagnier
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StreamingEntity extends AbstractMediaEntity<StreamingEntity> {
  private static final long serialVersionUID = 2338157869917224281L;

  @XmlElement
  private StreamingProvider provider;

  /**
   * Creates a new streaming entity from the specified streaming.
   * @param streaming
   * @return the entity representing the specified streaming.
   */
  public static StreamingEntity createFrom(final Streaming streaming) {
    return new StreamingEntity(streaming);
  }

  /**
   * Default hidden constructor.
   */
  private StreamingEntity(final Streaming streaming) {
    super(streaming);
    provider = streaming.getProvider();
  }

  @SuppressWarnings("UnusedDeclaration")
  protected StreamingEntity() {
    super();
  }

  public StreamingProvider getProvider() {
    return provider;
  }

  public void setProvider(final StreamingProvider provider) {
    this.provider = provider;
  }
}
