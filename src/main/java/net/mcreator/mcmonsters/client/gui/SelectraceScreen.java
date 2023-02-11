
package net.mcreator.mcmonsters.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.mcmonsters.world.inventory.SelectraceMenu;
import net.mcreator.mcmonsters.network.SelectraceButtonMessage;
import net.mcreator.mcmonsters.McMonstersMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SelectraceScreen extends AbstractContainerScreen<SelectraceMenu> {
	private final static HashMap<String, Object> guistate = SelectraceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SelectraceScreen(SelectraceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 191;
		this.imageHeight = 110;
	}

	private static final ResourceLocation texture = new ResourceLocation("mc_monsters:textures/screens/selectrace.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 8, 56, 20, Component.literal("Dragon"), e -> {
			if (true) {
				McMonstersMod.PACKET_HANDLER.sendToServer(new SelectraceButtonMessage(0, x, y, z));
				SelectraceButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 138, this.topPos + 8, 40, 20, Component.literal("Cat"), e -> {
			if (true) {
				McMonstersMod.PACKET_HANDLER.sendToServer(new SelectraceButtonMessage(1, x, y, z));
				SelectraceButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 43, this.topPos + 33, 51, 20, Component.literal("Ghost"), e -> {
			if (true) {
				McMonstersMod.PACKET_HANDLER.sendToServer(new SelectraceButtonMessage(2, x, y, z));
				SelectraceButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 63, this.topPos + 83, 72, 20, Component.literal("Exit Race"), e -> {
			if (true) {
				McMonstersMod.PACKET_HANDLER.sendToServer(new SelectraceButtonMessage(3, x, y, z));
				SelectraceButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 73, this.topPos + 8, 56, 20, Component.literal("Shadow"), e -> {
			if (true) {
				McMonstersMod.PACKET_HANDLER.sendToServer(new SelectraceButtonMessage(4, x, y, z));
				SelectraceButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 103, this.topPos + 33, 51, 20, Component.literal("Golem"), e -> {
		}));
	}
}
